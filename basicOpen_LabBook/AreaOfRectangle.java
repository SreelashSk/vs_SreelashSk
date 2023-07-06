package com.basicOpen_LabBook;

import java.util.Scanner;

public class AreaOfRectangle { // Area = l * w

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter length of the Area:");
		double length = scr.nextDouble();
		System.out.println("Enter width of the Area:");
		double width = scr.nextDouble();
		double areaOfRectangle = length * width;
		System.out.println("Area of Rectangle: " + areaOfRectangle);
		scr.close();
	}

}
