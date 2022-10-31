package com.arraypractice;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		int i, num, count = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}
}
