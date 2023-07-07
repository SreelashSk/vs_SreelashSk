package com.basicClose_LabBook;

public class Calculator {
	private static Calculator calci = new Calculator();
	private Calculator()
	{
		System.out.println("Calculator obj is Created!!!");
	}
	public static Calculator getcalci()
	{
		return getcalci();
	}
	public static void main(String[] args) {
		Calculator c1 = Calculator.getcalci();
		Calculator c2 = Calculator.getcalci();
	}

}
