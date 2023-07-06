package com.basicOpen_LabBook;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r = scr.nextDouble();
		double pi = 3.14;
		double area = pi * r * r;
		System.out.println("Area of Circle: " + area);
		double circum = 2 * pi * r;
		System.out.println("Circumferance of the Circle: " + circum);
		scr.close();
	}

}
