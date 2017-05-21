package xm.zjl.controller;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestPrintObject {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4};
		String[] str = new String[]{"123","jj","ll"};
		
		System.out.println(Arrays.asList(arr));
		System.out.println(Arrays.asList(str));
		
		Object o1 = new Object();
	}
}
