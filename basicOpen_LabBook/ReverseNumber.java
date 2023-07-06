package com.basicOpen_LabBook;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scr.nextInt();
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reversed Number is: " + rev);
		scr.close();
	}

}
