package com.zjl.controller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TestReflect {
	private String name = "朱建立";
	public int age = 23;
	
	public void getMethod(){
		System.out.println("zjl");
	}
	public static void testField() throws SecurityException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException{
		Field f1 = TestReflect.class.getField("age");
		TestReflect tr1 = TestReflect.class.newInstance();
		Method method = TestReflect.class.getMethod("method", null);
		System.out.println(tr1.age);
		System.out.println(tr1.name);
		Map map = new HashMap<String, String>();
	}
	
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, InstantiationException, IllegalAccessException {
	//	TestReflect.testField();
	}
}
