package coreJavaAssignment2;

import java.util.Scanner;

abstract class Shape {

	abstract void calculateArea();

	Scanner scr = new Scanner(System.in);

}

class Rectangle extends Shape {

	void calculateArea() {
		System.out.println("Enter Length of the Rectangle:");
		double length = scr.nextDouble();
		System.out.println("Enter Breadth of the Rectangle:");
		double width = scr.nextDouble();
		double area = length * width;
		System.out.println("Area of rectagle: " + area);

	}

}

class Circle extends Shape {

	void calculateArea() {
		System.out.println("Enter Radius of Circle:");
		double radius = scr.nextInt();
		double area = ((Math.PI) * (radius * radius));
		System.out.println("Area of Circle: " + area);

	}

}
