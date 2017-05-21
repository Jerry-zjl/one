package xm.zjl.controller;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import xm.zjl.Entity.User;


public class TestProperty {
	
	public static void main(String[] args) throws Exception{
		//User user = new User();
		PropertyDescriptor pd = new PropertyDescriptor("name", User.class);
		pd.setValue("name", "12345");
//		Method methodSetName = pd.getWriteMethod();
//		methodSetName.invoke(user, "name");
		
		System.out.println(pd.getValue("name"));
		System.out.println(pd.getName());
	}
}
