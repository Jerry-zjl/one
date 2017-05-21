package xm.zjl.aop;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean{

	private String target = null;
	
	private String interf = null;
	
	public Object getObject() throws Exception {
		Class[] interClass = new Class[]{Class.forName(interf)};
		Object objTarget = Class.forName(target).newInstance();
		Object objProxy = Proxy.newProxyInstance(Foo.class.getClassLoader(), interClass, new MyInvocationHandler(objTarget));
		return objProxy;
	}

	public Class getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getInterf() {
		return interf;
	}

	public void setInterf(String interf) {
		this.interf = interf;
	}

	
}
