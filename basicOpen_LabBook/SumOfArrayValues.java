package com.basicOpen_LabBook;

public class SumOfArrayValues {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 10 };
		int sum = 0;
		for (int data : arr) {
			sum = sum + data;
		}
		System.out.println("Sum of Array elements is: " + sum);
	}

}
