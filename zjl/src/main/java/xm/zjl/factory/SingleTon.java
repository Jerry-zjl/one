package xm.zjl.factory;

public class SingleTon {
	
	private static SingleTon single = new SingleTon();
	
	private SingleTon(){}
	
	public static SingleTon getInstance(){
		return single;
	}
	
}
