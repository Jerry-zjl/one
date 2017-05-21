package xm.zjl.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.zxing.WriterException;

/**
 * 
 * @author 朱建立
 *
 */
public class Main {

	private People people;

	public static void changeString(String str) {
		str = str + "12345";
	}

	public static void changeInt(int x) {
		x = x + 1;
	}

	public static void changeObj(People p1, People p2) {
		People temp = p1;
		p1 = p2;
		p2 = temp;
	}

	public static void swapInt(int x, int y) {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
	}

	public static void main(String[] args) throws WriterException, IOException {

		ArrayList<String> strss = new ArrayList<String>();
		strss.add("a");
		strss.add("b");
		strss.add("c");
		strss.add("d");
		strss.add("e");
		strss.add("f");
		for (int i = 0; i < strss.size(); i++) {
			if (strss.get(i).equals("a")) {
				strss.remove("a");
			}

		}
		System.out.println("strs--->" + strss);/*
												 * for(String s:strs){
												 * if(s.equals("c")){
												 * strs.remove(s); } }
												 * System.out
												 * .println("strs--->"+strs);
												 */

		/*
		 * List<String> list = new ArrayList();
		 * 
		 * for(int i = 0; i<10; i++) { list.add("This is" + i); }
		 * System.out.println("hello");
		 * 
		 * list.remove("This is1");
		 * 
		 * for(Iterator iter = list.iterator(); iter.hasNext(); ) { String str =
		 * (String) iter.next(); // if(str.indexOf("1") != -1) // {
		 * if(str.equals("This is4")) //情况一 iter.remove(); //情况二
		 * //list.remove(str); // } } System.out.println(list); //情况三 for(String
		 * strs : list) {
		 * 
		 * list.remove(strs); System.out.println(strs);
		 * 
		 * }
		 * 
		 * for(String strT : list) { System.out.println(strT); }
		 */
		People people = new People();
		ss(people);
		// ByteArrayOutputStream bs =
		// QRCode.from("kiss my asses!").to(ImageType.PNG).stream();
		// try {
		// FileOutputStream fos = new FileOutputStream(new
		// File("d:"+File.separator+"kk.png"));
		// fos.write(bs.toByteArray());
		//
		// fos.flush();
		// fos.close();
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// String text = "你好";
		// int width = 100;
		// int height = 100;
		// String format = "png";
		// Hashtable hints= new Hashtable();
		// hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		// BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
		// BarcodeFormat.QR_CODE, width, height,hints);
		// File outputFile = new File("new.png");
		// MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
		/*
		 * for(int i=101 ; i <=300;i++){ System.out.println("XMB"+i); }
		 */
		/*
		 * String sb = "nihao"; System.out.println("之前-------》"+sb);
		 * changeString(sb); System.out.println("之后-----》"+sb); int i = 1;
		 * changeInt(i); System.out.println("int--->"+i); People p1= new
		 * People(1, "aaa"); People p2 = new People(2, "bbb");
		 * System.out.println("之前-----》"+p1.getName()+"p2----->"+p2.getName());
		 * changeObj(p1, p2);
		 * System.out.println("之后-----》"+p1.getName()+"p2----->"+p2.getName());
		 * int x= 5; int y = 6; swapInt(x, y);
		 * System.out.println("x---------->"+x+"-------->"+y);
		 */
	}

	public static void ss(People people) {
		ArrayList<People> peoples = new ArrayList<People>();
		People p1 = new People(10, "朱建立");
		People p2 = new People(15, "田俊梅");
		People p3 = new People(20, "zjl");
		People p4 = new People(25, "tjm");
		People p5 = new People(30, "zt");
		peoples.add(p1);
		peoples.add(p2);
		peoples.add(p3);
		peoples.add(p4);
		peoples.add(p5);
		System.out.println(peoples);
		// People p = new People(age, name)
		for (int i = 0; i < peoples.size(); i++) {
			people = peoples.get(i);
			people.setName(people.getAge() + "");
		}
		System.out.println("----" + peoples);
	}
}

class People {
	private int age;
	private String name;

	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	public People(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [age=" + age + ", name=" + name + "]";
	}

}