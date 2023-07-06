package com.basicOpen_LabBook;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = scr.nextInt();
		if (num % 2 == 0) {
			System.out.println("Given Number is Even");
		} else {
			System.out.println("Given Number is Odd");
		}
		scr.close();
	}
}
