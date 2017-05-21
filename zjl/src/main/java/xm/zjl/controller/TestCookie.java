package xm.zjl.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie/*")
public class TestCookie {
	
	@RequestMapping("show")
	public String getCookie(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		Cookie cookie = new Cookie("cookieTest",URLEncoder.encode("朱建立"));
		cookie.setPath("/");
		response.addCookie(cookie);
		Cookie[] coos = request.getCookies();
		for(Cookie coo:coos){
			System.out.println(coo.getName()+"--->"+URLDecoder.decode(coo.getValue()));
		}
		return "success";
	}
}
