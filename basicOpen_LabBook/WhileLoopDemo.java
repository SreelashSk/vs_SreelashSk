package com.basicOpen_LabBook;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		Scanner scr = new Scanner (System.in);
		System.out.println("Please Enter Any Integer Value below 10");
		num = scr.nextInt();
		while(num<=10)
		{
			sum = sum + num;
			num ++;
		}
		System.out.println(sum);
		scr.close();
	}

}
