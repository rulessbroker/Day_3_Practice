package com.arraypractice;

public class ArrayNthLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 10, 37, 93, 82, 75, 84 };
		int temp;
		int total = arr.length;
		for (int i = 0; i < total; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[total - 1]);
	}
}
