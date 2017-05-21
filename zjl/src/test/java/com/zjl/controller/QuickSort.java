package com.zjl.controller;

public class QuickSort {

	public static void quickSort(int[] arry, int left, int right) {
		int pivot;
		if (right > left) {
			pivot = partition(arry, left, right);
			quickSort(arry, left, pivot - 1);
			quickSort(arry, pivot + 1, right);

		}
	}
	public static int partition(int[] arry, int left, int right) {
		int pivot = arry[left];
		while (right > left) {
			while (right > left && arry[right] >= pivot) {
				right--;
			}
			if (right > left)
				arry[left++] = arry[right];
			while (right > left && arry[left] <= pivot) {
				left++;
			}
			if (right > left) {
				arry[right--] = arry[left];
			}
		}
		pivot = arry[left];
		return left;
	}
	public static void main(String[] args) {
		int[] arr = {4,8,3,5,1,9,10};
		quickSort(arr, 0, 6);
		for(int ar:arr){
			System.out.println(ar);
		}
	}
}
