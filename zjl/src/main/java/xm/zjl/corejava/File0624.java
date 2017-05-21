package xm.zjl.corejava;

import java.io.Console;
import java.util.Scanner;

import xm.zjl.enumtest.Size;

public class File0624 {
	
	public static void main(String[] args) {
		/*Scanner in =new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("How old are you?");
		int age = in.nextInt();
		System.out.println("name-->"+name+"age-->"+age);*/
		/*Scanner in = new Scanner(System.in);
		Console con = System.console();
		System.out.println(con);
		String userName = con.readLine("User name:");
		char[] password = con.readPassword("password:");
		System.out.println("name"+userName+"password---->"+password);*/
		Size size = Size.SMALL;
//		System.out.println(size);
//		System.out.println(size.viewName());
//		System.out.println(size.value());
		
		switch(size){
		case SMALL:
			System.out.println("1");
		case BIG:
			System.out.println("2");
			break;
		
		}
	}
}
