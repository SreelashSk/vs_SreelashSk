package com.basicOpen_LabBook;

public class LargestNumber {
	public static void main(String[] args) {
		double a = -5.5, b = 4.5, c = 3.5;
		if (a > b && a > c) {
			System.out.println(a + " is Largest");
		} else if (b > a && b > c) {
			System.out.println(b + " is Largest");
		} else {
			System.out.println(c + " is Largest");
		}
	}
}
