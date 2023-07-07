package com.basicClose_LabBook;

public class DisplayNumberMatrix {

	public static void main(String[] args) {
		int rows = 4;
		int columns = 4;
		int[][] arr = new int[rows][columns];
		int k = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		System.out.println("2D Array is...");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + "	");
			}
			System.out.println();
		}
		
		System.out.println("************************");
		
		int rows1 = 4;
		int columns1 = 4;
		int[][] arr1 = new int[rows1][columns1];
		int k1 = 1;
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				if (i>=j) {
					arr1[i][j] = k1;
					k1++;
				}
			}
		}
		System.out.println("2D Array is...");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				System.out.print(arr1[i][j] + "	");
			}
			System.out.println();
		}
	}

}
