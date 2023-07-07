package com.basicClose_LabBook;

import java.util.Scanner;

public class ArmstrongPerfectPalindromeNoneOfThese {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = scr.nextInt();
		int sum = 0;
		int sum1 = 0;
		int rev = 0;
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			rev = rev * 10 + rem;
			num = num / 10;
		}
		for (int i = 1; i < temp; i++) {
			if (temp % i == 0) {
				sum1 = sum1 + i;
			}
		}
		if (temp == sum) {
			System.out.println(temp + " is a Armstrong number");
		} else if (temp == rev) {
			System.out.println(temp + " is a Palindrome number");
		} else if (temp == sum1) {
			System.out.println(temp + " is a Perfect number");
		} else {
			System.out.println("None of these");
		}
		scr.close();
	}

}
