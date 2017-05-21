package xm.zjl.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import xm.zjl.Entity.User;

/**
 * 导出Excel不理想，弃用
 * @author 朱建立
 *
 */
public class ExcelUtil {

	public static void exportExcel() throws Exception, InvalidFormatException, IOException {
		String srcPath = "d:"+File.separator+"excel"+File.separator+"emp.xlsx";
		String destPath = "d:"+File.separator+"excel"+File.separator+"des.xlsx";
		List<User> users = new ArrayList<User>();

		User u1 = new User(1,"章子", "女");
		User u2 = new User(2,"汪峰", "男");
		users.add(u1);
		users.add(u2);
		Map beans = new HashMap<String, Object>();
		beans.put("users", users);
		XLSTransformer transformer = new XLSTransformer();
		transformer.markAsFixedSizeCollection("users");
		transformer.transformXLS(srcPath, beans, destPath);
	}

	public static void main(String[] args) throws Exception, IOException, Exception {
		ExcelUtil.exportExcel();
	}

}
