package xm.zjl.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;

public class ReflectTest {
	
	
	public int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args) throws Exception {
		Class clazz = ReflectPoint.class;
		ReflectPoint rp1 = new ReflectPoint(3+"", 5+"");
		Field field = clazz.getDeclaredField("x"); 
		field.setAccessible(true);
		//System.out.println(field.get(rp1));
		Class cls1 = ReflectTest.class;
		ReflectTest rt = new ReflectTest();
		Method method = cls1.getMethod("add",int.class,int.class);
		method.invoke(rt,1,2);
		//System.out.println(method.invoke(rt,1,2));
		
		Method method2 = clazz.getMethod("main", String[].class);
		method2.invoke(null, (Object)new String[]{"123","4365"});
		//System.out.println(method2.invoke(null, (Object)new String[]{"1234","265"}));
		
	}
}
