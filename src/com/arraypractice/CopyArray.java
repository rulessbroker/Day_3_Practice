package com.arraypractice;

public class CopyArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 7, 2 };
		System.out.println("Original array");
		for (int array : arr) {
			System.out.println(array);
		}
		System.out.println("Copied arrays");
		int array1[] = arr;
		for (int arr2 : array1) {
			System.out.println(arr2);

		}
		
		copyElement();
	}
	
	static void copyElement() {
		String name[] = {"RB", "shyam", "Radhe"};
		String newName[] = new String[name.length];
		
		for(int i = 0; i < name.length; i++) {
//			name[i] = newName[i];
			System.out.println(name[i]);
		}
		
		for(int i = 0; i < newName.length; i++) {
			System.out.println(newName[i]);
		}
	}
}
