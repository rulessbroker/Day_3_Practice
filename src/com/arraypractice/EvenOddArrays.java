package com.arraypractice;

public class EvenOddArrays {
	public static void main(String[] args) {
		int data[] = new int[100];
		System.out.println("Even Numbers");
		for(int i = 0; i <= data.length; i++) {
//			data[i] = i + 1;
			if(i % 2 != 0) {
				System.out.println(i);
			}
			
		}
		
	}
}
