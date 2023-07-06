package com.basicOpen_LabBook;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a = scr.nextInt();
		System.out.println("Enter 2nd Number:");
		int b = scr.nextInt();
		
		int c = a + b;
		
		System.out.println(a+" + "+b+" = "+c);
		scr.close();
	}

}
