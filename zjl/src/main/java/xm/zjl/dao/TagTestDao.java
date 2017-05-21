package xm.zjl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import xm.zjl.Entity.User;
import xm.zjl.util.ObjectRowMapper;

/**
 * 测试标签dao
 * 
 * @author zjl
 *
 */
@Repository("tagTestDao")
public class TagTestDao implements BaseDao<User> {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private Class clazz = null;

	public List getList(){
		String sql = "select * from user";
		RowMapper<User> uerRow = new ObjectRowMapper<User>();
		List<User> ll = jdbcTemplate.query(sql, uerRow);
		List<User> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class));
		System.out.println("size------------>"+list.size());

		return list;
	}
	public HSSFWorkbook executeQuery(){
		HSSFWorkbook workbook = new HSSFWorkbook();
		Connection con = null;
		Statement st = null;
		final String sql = "select * from user";
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			if(con.isClosed()){
				System.out.println("数据库连接失败！！！");
			}
			st = con.createStatement();
			rs = st.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(rs != null){
			String sheetName = "人员名单";
			 try {  
	                workbook = this.resultSetToExcel(rs, sheetName);  
	            } catch (Exception e) {  
	                // TODO Auto-generated catch block  
	                e.printStackTrace();  
	            }  
		}
		return workbook;
	}
	 public  HSSFWorkbook resultSetToExcel(ResultSet rs, String sheetName) throws Exception  {
		
		 HSSFWorkbook workbook = new HSSFWorkbook();
		 HSSFSheet sheet = workbook.createSheet("人员名单");
		 HSSFRow row = sheet.createRow(0);
		 HSSFCell cell=null;
		 ResultSetMetaData md = rs.getMetaData();
		 int nColumn = md.getColumnCount();
		 System.out.println("nColumn:"+nColumn+"sheetName:"+sheetName);
		 System.out.println("sheet:-------->"+sheet);
		 for(int i=1 ; i<=nColumn; i++){
			 cell = row.createCell(i-1);
			 cell.setCellType(HSSFCell.CELL_TYPE_STRING);
			 cell.setCellValue(md.getColumnLabel(i));
			 System.out.println(md.getColumnLabel(i));
		 }
		 int irow = 1;
		 while(rs.next()){
			 row = sheet.createRow(irow);
			 for(int j =1 ; j<=nColumn;j++){
				 cell = row.createCell(j-1);
				 cell.setCellType(HSSFCell.CELL_TYPE_STRING);
				 Object obj = rs.getObject(j);
				 if(obj == null){
					 obj ="";
				 }
				 cell.setCellValue(obj.toString());
			 }
			 irow++;
		 }
		 
		 return workbook;
		 
	 }
}
