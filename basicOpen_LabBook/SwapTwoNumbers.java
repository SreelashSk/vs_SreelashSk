package com.basicOpen_LabBook;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		float a = 2.50f;
		float b = 4.50f;
		System.out.println("Before Swapping:");
		System.out.println("First Number: " + a);
		System.out.println("Second Number: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping:");
		System.out.println("First Number: " + a);
		System.out.println("Second Number: " + b);
	}
}
