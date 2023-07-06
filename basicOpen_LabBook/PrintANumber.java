package com.basicOpen_LabBook;

import java.util.Scanner;

public class PrintANumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = scr.nextInt();
		System.out.println("Your Entered Number is " + number);
		scr.close();
	}
}
