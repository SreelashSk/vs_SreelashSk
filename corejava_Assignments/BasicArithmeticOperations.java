package corejava_Assignments;

import java.util.Scanner;

public class BasicArithmeticOperations {

	public static double addition(double a, double b) {
		double c = a + b;
		return c;
	}

	public static double substraction(double a, double b) {
		double c = a - b;
		return c;
	}

	public static double multiplication(double a, double b) {
		double c = a * b;
		return c;
	}

	public static double division(double a, double b) {
		double c = a / b;
		return c;
	}

	public static double power(double base, double exponent) {
		double pow = Math.pow(base, exponent);
		return pow;
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter 1st number");
		double num1 = scr.nextDouble();
		System.out.println("Enter 2nd Number");
		double num2 = scr.nextDouble();
		System.out.println("ADDITION::    "+num1+" + "+num2+" = "+addition(num1, num2));
		System.out.println("SUBTRACTION::    "+num1+" - "+num2+" = "+substraction(num1, num2));
		System.out.println("MULTIPLICATION::    "+num1+" * "+num2+" = "+multiplication(num1, num2));
		System.out.println("DIVISION::    "+num1+" / "+num2+" = "+division(num1, num2));
		System.out.println("POWER CALCULATION::    "+num1+" ^ "+num2+" = "+power(num1, num2));
		scr.close();
	}
}
