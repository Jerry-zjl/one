package xm.zjl.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class MyInvocationHandler implements InvocationHandler {
	
	private Object fooClass;
	public MyInvocationHandler(Object fooClass) {
		this.fooClass = fooClass;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Log log = LogFactory.getLog(MyInvocationHandler.class);
		log.info("this is "+MyInvocationHandler.class.getName()+"you want invoke "+method.getName());
		return method.invoke(fooClass, args);
	}

}
