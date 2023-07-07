package com.basicClose_LabBook;

public class Test {
	static int x = 10;

	void m1() {
		System.out.println(x);
	}

	/*
	 * Test(int x) { Test t1 = new Test(); }
	 */ // (its not possible to instantiate object without parameter in one argument
		// constructor)

	public static void main(String[] args) {
//		final int x = 10;
//		x = 11;			//never possible to modify constant member.

		System.out.println(Test.x);
	}
}
