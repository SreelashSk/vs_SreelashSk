package com.basicClose_LabBook;

public class PrimeNumberList {
	static boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		for (int num = 1; num<=100; num++) {
			if (isPrime(num)) {
				System.out.println("Prime Number: "+num);
			}
		}
	}

}
