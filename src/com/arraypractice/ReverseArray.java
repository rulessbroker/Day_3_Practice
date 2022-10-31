package com.arraypractice;

public class ReverseArray {
	public static void main(String[] args) {
		short arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("\nReverse Order");
		for (int i = arr.length - 1; i > -1; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
