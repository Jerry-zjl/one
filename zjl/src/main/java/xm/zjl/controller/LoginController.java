package xm.zjl.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xm.zjl.service.UserService;

/**
 * 登录controller
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user/*")
public class LoginController {
	@Autowired
	private UserService userService;
	@RequestMapping(value="login.do")
	public @ResponseBody Map<String,Object> login(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println(request.getParameter("name"));
		Map<String,Object> map = new HashMap<String,Object>();
		
		if(request.getParameter("name").equals("123")){
			System.out.println("城东");
			map.put("msg", "成功");
		}else{
			System.out.println("失败");
			map.put("msg", "失败");
		}
		return map;
	}
	@RequestMapping("test.do")
	public String test(Model model){
		System.out.println(userService.getList().size());
		model.addAttribute("list",userService.getList());
		return "success";
	}
	@RequestMapping("regist.do")
	public String regist(HttpServletRequest request,HttpServletResponse response){
		System.out.println("做你要做的事");
		return "success";
	}
}
