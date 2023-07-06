package com.basicOpen_LabBook;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scr.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is Not a Prime number");
		}
		scr.close();
	}

}
