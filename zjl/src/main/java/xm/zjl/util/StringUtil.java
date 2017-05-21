package xm.zjl.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class StringUtil {
	public static void main(String[] args) {
		CloseableHttpClient httpclient = HttpClients.createDefault();  
        // 创建httppost    
        HttpPost httppost = new HttpPost("http://61.145.229.28:5001/voiceprepose/MongateSendSubmit");  
        // 创建参数队列    
        List<BasicNameValuePair> formparams = new ArrayList<BasicNameValuePair>();  
        formparams.add(new BasicNameValuePair("username", "admin"));  
        formparams.add(new BasicNameValuePair("password", "123456d"));  
        UrlEncodedFormEntity uefEntity; 
        try {  
            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
            httppost.setEntity(uefEntity);  
            System.out.println("executing request " + httppost.getURI());  
            CloseableHttpResponse response = httpclient.execute(httppost);  
            try {  
                HttpEntity entity = response.getEntity();  
                if (entity != null) { 
                	
                	//String content = EntityUtils.toString(entity, "UTF-8");
                	DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance(); 
                	DocumentBuilder builder = factory.newDocumentBuilder();
                	Document doc =  builder.parse(entity.getContent());
                	NodeList codes = doc.getElementsByTagName("string");
                	String[] split = {};
                	for(int i=0;i<codes.getLength();i++){
                		Element element = (Element) codes.item(i);
                		String value = element.getFirstChild().getNodeValue();
                		split = value.split(":");
                		if(!StringUtils.isEmpty(split)){
                			for(int j=0;j<split.length;j++){
                				System.out.println(split[j]);
                			}
                		}
                		System.out.println(value);
                		
                		//String code = element.getAttribute("string");
                	}
                	//NamedNodeMap element = doc.getAttributes();
                	//String sig = element.getTextContent();
                	/*for(int i=0;i<element.getLength();i++){
                		System.out.println(element.getNamedItem(""));
                	}*/
                	//System.out.println(element.);
                    System.out.println("--------------------------------------");  
                   // System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));  
                    System.out.println("--------------------------------------");  
                }  
            } finally {  
                response.close();  
            }  
        } catch (ClientProtocolException e) {  
            e.printStackTrace();  
        } catch (UnsupportedEncodingException e1) {  
            e1.printStackTrace();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            // 关闭连接,释放资源    
            try {  
                httpclient.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
	}
}
