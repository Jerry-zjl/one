package xm.zjl.corejava;

import java.util.Scanner;

/**
 * @author alter
 *
 */
public class File0622 {
	
	public static void main(String[] args) {
		char ch = "sentence".charAt(1);
		int ch1 = "setence".codePointAt(2);
		/*System.out.println(ch);
		System.out.println(ch1);
		System.out.println(Character.isSupplementaryCodePoint(ch1));
		System.out.println(Character.isSurrogate(ch));
		
		System.out.println("sentence".indexOf(116, 0));*/
		StringBuilder sb = new StringBuilder();
		sb.append("zjl");
		System.out.println(sb.length());
		sb.append('j');
		System.out.println(sb.length());
		sb.appendCodePoint(101);
		System.out.println(sb+"--->"+sb.length());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name");
		String name = scan.nextLine();
	}
}
