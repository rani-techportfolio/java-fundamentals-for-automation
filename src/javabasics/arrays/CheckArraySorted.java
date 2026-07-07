package javabasics.arrays;

import java.util.Scanner;

public class CheckArraySorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " elements:");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		boolean sorted = true;

		// Compare the adjacent elements
		for (int j = 0; j < size - 1; j++) {

			if (arr[j] > arr[j + 1]) {
				sorted = false;
				break;

			}
		}

		if (sorted)
			System.out.println("The array is sorted");

		else
			System.out.println("The array is not sorted");

		sc.close();

	}

}
