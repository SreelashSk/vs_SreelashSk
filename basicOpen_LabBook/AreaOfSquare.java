package com.basicOpen_LabBook;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter side of Square");
		double side = scr.nextDouble();
		double areaOfSquare = side * side;
		System.out.println("Area of Square : "+areaOfSquare);
		scr.close();
	}

}
