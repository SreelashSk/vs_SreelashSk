package com.basicClose_LabBook;

import java.util.Arrays;

public class ReverseElementInArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int size = arr.length;
		int [] arr1 = new int [size];
		int i = 0;
		while (i!=size) {
			arr1[size - 1 - i] = arr[i];
			i++;
		}
		System.out.println("Original Element in Array: "+Arrays.toString(arr));
		System.out.println("Reverse Element in Array: "+Arrays.toString(arr1));
	}

}
