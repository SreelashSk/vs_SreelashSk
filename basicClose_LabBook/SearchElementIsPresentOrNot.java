package com.basicClose_LabBook;

public class SearchElementIsPresentOrNot {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,4,4,4,5};
		int key = 4;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				/* System.out.println("Element '"+key+"' is Present"); */
				System.out.println("Element " +key+ " is Located in index "+i);
				count++;
			}
		}
		System.out.println(count+" times it Occurs!!");
	}
}
