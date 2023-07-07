package com.basicClose_LabBook;

public class DeclareAllPrimitiveDatatypes {

	public static void main(String[] args) {
		// implicit type casting
		System.out.println("*********************");
		System.out.println("\n");
		System.out.println("implicit type casting");
		byte b = 10;
		short s = b;
		int i = b;
		long l = b;
		float f = b;
		double d = b;
		
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		
		System.out.println("*********************");
		System.out.println("\n");
		//Explicit type casting
		System.out.println("explicit type casting");
		double d1 = 10;
		byte b1 = (byte)d1 ;
		short s1 = (short)d1;
		int i1 = (int)d1;
		long l1 = (long)d1;
		float f1 = (float)d1;
		System.out.println("double: "+d1);
		System.out.println("byte: " + b1);
		System.out.println("short: " + s1);
		System.out.println("int: " + i1);
		System.out.println("long: " + l1);
		System.out.println("float: " + f1);
		System.out.println("*********************");

	}

}
