package com.basicOpen_LabBook;

public class PyramidExampleReverse {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j <= n - 1) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
