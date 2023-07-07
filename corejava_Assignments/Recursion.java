package corejava_Assignments;

import java.util.Scanner;

public class Recursion {
	public static int fact(int n) {
		if (n==0 || n==1) {
			return n;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number:");
		int x = scr.nextInt();
		System.out.println("Factorial Calculation: "+fact(x));
	}

	

}
