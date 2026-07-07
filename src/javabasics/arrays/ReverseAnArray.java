package javabasics.arrays;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		// Read the array elements
		System.out.println("Enter " + size + " elements:");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Print the array before reversing

		System.out.print("Array before reversing: ");

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int start = 0;
		int end = size - 1;
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

		// Print the array after reversing
		System.out.print("Array after reversing: ");

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}

}
