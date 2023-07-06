package com.basicOpen_LabBook;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = scr.nextInt();
		if (num %2==0) {
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		scr.close();
	}

}
