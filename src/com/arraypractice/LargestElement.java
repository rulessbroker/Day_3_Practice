package com.arraypractice;

public class LargestElement {
	public static void main(String[] args) {
		int element[] = { 3, 5, 3, 6, 8, 39, 3, 1 };
//		Arrays.sort(element);
		smallestNum(element);
		largestNum(element);
	}

	static void smallestNum(int element[]) {
		int count = 0;
		int min = element[0];
		for (int i = 0; i < element.length; i++) {
			count++;
			if (min > element[i]) {
				min = element[i];

			}
		}
		System.out.println("minimum number = " + min);
		System.out.println(count);

	}

	static void largestNum(int element[]) {
		int max = element[0];
		for (int i = 0; i < element.length; i++) {
			if (max < element[i]) {
				max = element[i];
			}
		}
		System.out.println("maximum number = " + max);

	}
}
