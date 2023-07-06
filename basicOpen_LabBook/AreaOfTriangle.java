package com.basicOpen_LabBook;

import java.util.Scanner;

public class AreaOfTriangle { // AreaOfTriangle = width * height / 2;

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter width of Triangle:");
		double width = scr.nextDouble();
		System.out.println("Enter Height of Triangle:");
		double height = scr.nextDouble();

		double areaOfTriangle = (width * height) / 2;
		System.out.println("Area of Triangle: " + areaOfTriangle);
		scr.close();

	}

}
