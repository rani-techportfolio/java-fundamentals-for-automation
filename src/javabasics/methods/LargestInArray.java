package javabasics.methods;

import java.util.Scanner;

public class LargestInArray {

	public static int[] readArray() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the array elements:");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		return arr;

	}

	public static int findLargest(int[] arr) {

		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		return largest;
	}

	public static void main(String[] args) {

		// static methods belongs to class so can be called directly

		int[] arr = readArray();

		int largest = findLargest(arr);

		System.out.println("Largest element in the array: " + largest);

	}
}
