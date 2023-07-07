package com.basicClose_LabBook;

public class LocationOfElementInArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int size = arr.length;
		int i = 0;
		int pos = 1;
		while (i!=size) {
			System.out.println(arr[i]);
			pos = i;
			i++;
		}
		System.out.println("Location is: "+pos);
	}
}
