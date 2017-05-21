package xm.zjl.view;

import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ViewExcel extends AbstractExcelView {

	@Override
	public void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String fileName = "view名单";
		fileName = new String(fileName.getBytes("utf-8"),"ISO8859-1");
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-disposition", "attachment;filename=" + fileName);
		OutputStream ouputStream = response.getOutputStream();
		workbook.write(ouputStream);
		ouputStream.flush();
		ouputStream.close();

	}

}
