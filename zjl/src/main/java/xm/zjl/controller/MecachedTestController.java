package xm.zjl.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import xm.zjl.Entity.User;
import xm.zjl.interf.MemcachedTestService;

/**
 * mem测试
 * 
 * @author 朱建立
 *
 */
@Controller 
@RequestMapping("/mem/*")
public class MecachedTestController {
	
	@Resource
	private MemcachedTestService memcachedTestServie;
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public void login(HttpServletRequest request,HttpServletResponse response,@RequestParam("yzm") String yzm,User user){
		
		User muser = memcachedTestServie.getUserById(user.getId()+"");
		System.out.println("ymz"+muser);
		user.setId(1234567);
		memcachedTestServie.saveLoginPerson(user);
		
		
	}
}
