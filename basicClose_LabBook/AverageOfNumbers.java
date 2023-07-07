package com.basicClose_LabBook;

public class AverageOfNumbers {
	public static void main(String[] args) {
		int result = average();
		System.out.println("Total Elements in Array is: "+result);
		System.out.println("Average is: "+result/5);
	}
	public static int average() {
		int[] arr = { 10, 20, 30, 40, 50 };
		int total = 0;
		for (int data : arr) {
			total = total + data;
		}
		return total;
	}
}
