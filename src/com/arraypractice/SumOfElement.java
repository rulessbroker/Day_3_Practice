package com.arraypractice;

import java.util.Arrays;
import java.util.Collections;

public class SumOfElement {
	public static void main(String[] args) {
		Integer element[] = { 3, 5, 3, 6, 8, 39, 3, 1 };
		int sum = 0;
		for (int add : element) {
			sum += add;
			System.out.print(add + " ");
		}
		System.out.println("\n total : " + sum);

	}

}
