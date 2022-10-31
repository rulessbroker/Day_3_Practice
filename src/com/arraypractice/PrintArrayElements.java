package com.arraypractice;

import java.util.Arrays;

public class PrintArrayElements {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 2, 1, 4 };

//		simple Array print
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
//		with simple for-each
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
//		with toString
		System.out.println(Arrays.toString(arr));
		
	}
}
