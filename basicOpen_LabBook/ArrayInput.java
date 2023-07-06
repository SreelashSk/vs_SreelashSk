package com.basicOpen_LabBook;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the elements");
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i <10; i++) {
			arr[i] = scr.nextInt();
		}
		for (int data : arr) {
			sum = sum + data;
		}
		System.out.println("Sum of Array elements is : "+sum);
		scr.close();
	}

}
