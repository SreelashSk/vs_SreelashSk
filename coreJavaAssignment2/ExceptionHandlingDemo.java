package coreJavaAssignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void division() {
		try {
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter dividend");
			int dividend = scr.nextInt();
			System.out.println("Enter divisor");
			int divisor = scr.nextInt();
			int quotient = dividend / divisor;
			System.out.println("Quotient: "+quotient);
			scr.close();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		division();
	}

}
