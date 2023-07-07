package com.basicClose_LabBook;

public class SortAnArray {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 4, 2 };
		System.out.println("::SORT ARRAY IN ASCENDING::\n");
		System.out.println("Arrays before sorting:");
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - j - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int swap = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = swap;
				}
			}
		}
		System.out.println("\nArrays After sorting:");

		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n**************************");

		int[] arr1 = { 3, 5, 1, 4, 2 };
		System.out.println("::SORT ARRAY IN DESCENDING::\n");
		System.out.println("Arrays before sorting:");
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		for (int j = 0; j < arr1.length; j++) {
			for (int i = 0; i < arr1.length - j - 1; i++) {
				if (arr1[i] < arr1[i + 1]) {
					int swap = arr1[i];
					arr1[i] = arr1[i + 1];
					arr1[i + 1] = swap;
				}
			}
		}
		System.out.println("\nArrays After sorting:");
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}
}