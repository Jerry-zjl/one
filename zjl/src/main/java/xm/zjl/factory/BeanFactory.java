package xm.zjl.factory;

public class BeanFactory implements AbstractBeanFactory{

	public SingleTon getSingleTon() {
		return SingleTon.getInstance();
	}
	
}
