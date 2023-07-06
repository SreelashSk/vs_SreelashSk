package com.basicOpen_LabBook;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
//		int rows, number = 1, counter, j;

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Number of rows for Floyd's Triangle:");
		int rows = scr.nextInt();
		System.out.println("Floyd's Triangle");

		System.out.println("****************");

		int k = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (i >= j) {
					System.out.print(k++ + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
