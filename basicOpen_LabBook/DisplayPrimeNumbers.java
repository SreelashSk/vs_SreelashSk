package com.basicOpen_LabBook;

public class DisplayPrimeNumbers {
	static boolean isPrime(int num)
	{
		int count = 0;
		for (int i = 1; i <=num; i++) {
			if (num % i == 0) {
				count ++;
			}
		}
		if (count == 2) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100 are:");
		for (int num = 1; num <=100; num++) {
			if (isPrime(num)) {
				System.out.println(num);
			}
		}
	}

}
