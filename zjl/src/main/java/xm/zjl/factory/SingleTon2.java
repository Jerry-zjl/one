package xm.zjl.factory;

public class SingleTon2 {
	private static SingleTon2 single = new SingleTon2();
	
	private SingleTon2(){}
	
	public static SingleTon2 getInstance(){
		return single;
	}
}
