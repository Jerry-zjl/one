package xm.zjl.aop;

public class Children extends Parent {
	
	String name="子类属性";

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	
	
	@Override
	public String toString() {
		return "Children [name=" + name + "]";
	}

	public void printMethod(){
		System.out.println("这是子类的方法打印的");
	}
	
	public static void main(String[] args) {
		Parent p = new Children();
		System.out.println(p);
		Children c = (Children) p;
		p.name="12";
		System.out.println("----"+c.getName());
		System.out.println(c == p);
	}
}
