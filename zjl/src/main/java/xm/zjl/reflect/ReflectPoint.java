package xm.zjl.reflect;

public class ReflectPoint {
	private String x;
	
	public String y;

	public ReflectPoint(String x, String y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "ReflectPoint [x=" + x + ", y=" + y + "]";
	}
	
	public static void main(String[] args) {
		for(String str : args){
			System.out.println(str);
		}
		
	}
}
