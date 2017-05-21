package xm.zjl.service;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xm.zjl.dao.TagTestDao;

/**
 * userService
 * 
 * @author 鏈卞缓绔�
 *
 */
@Service("userService")
public class UserService {
	@Autowired
	private TagTestDao tagTestDao;
	
	public List getList(){
		return tagTestDao.getList();
	}
	
	public HSSFWorkbook exportExcelSheet(){
		HSSFWorkbook workBook = new HSSFWorkbook();
		final String sql = "select * from user ";
		workBook = tagTestDao.executeQuery();
		return workBook;
		
	}
	
}
