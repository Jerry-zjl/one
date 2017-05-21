package xm.zjl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xm.zjl.service.UserService;
import xm.zjl.view.ViewExcel;

/**
 * 测试自定义标签
 * 
 * @author zjl
 *
 */
@Controller
@RequestMapping(value = "/tag/")
public class TagTestController {
	@Autowired
	private UserService userService;

	public List getList() {
		String sql = "select * from ";
		List list = new ArrayList();
		return list;
	}

	@RequestMapping("export.do")
	public ModelAndView exportExcel(ModelMap model, HttpServletRequest request,
			HttpServletResponse response) {
		ViewExcel viewExcel = new ViewExcel();
		Map<String, Object> obj = null;
		Map<String, Object> condition = new HashMap<String, Object>();
		HSSFWorkbook workbook = userService.exportExcelSheet();
		try {
			viewExcel.buildExcelDocument(obj, workbook, request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView(viewExcel, model);
	}
}
