package xm.zjl.util;

import java.io.File;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class QRCodeEvents {
	public static void main(String []args)throws Exception{   
        String text = "这是内容";   
        int width = 100;   
        int height = 100;   
        String format = "png";   
        Hashtable hints= new Hashtable();   
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");   
         BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height,hints);   
         File outputFile = new File("d:"+File.separator+"kk.png");   
         MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);   
// 		System.out.println(id);
// 		String text = id;
// 		int width = 400;
// 		int height = 400;
// 		String format = "png";
// 		Hashtable hints = new Hashtable();
// 		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
// 		String dirPath = request.getSession().getServletContext().getRealPath("/qrcode");
// 		File dir = new File(dirPath);
// 		if (!dir.exists()) {
// 			dir.mkdirs();
// 		}
// 		File outputFile = null;
// 		try {
// 			BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE,
// 					width, height, hints);
 //
// 			outputFile = new File(dirPath + File.separator + text + ".png");
// 			MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
// 		} catch (Exception e) {
// 			e.printStackTrace();
// 		}   
    }   
}
