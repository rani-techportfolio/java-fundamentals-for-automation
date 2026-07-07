package javabasics.arrays;

import java.util.Scanner;

public class OddEvenCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		// Read the array elements
		System.out.println("Enter " + size + " elements:");

		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		int oddcount = 0;
		int evencount = 0;

		for (int j = 0; j < size; j++) {

			if (arr[j] % 2 == 0)
				evencount++;

			else
				oddcount++;
		}

		System.out.println("Number of even numbers in the array is " + evencount);
		System.out.println("Number of odd numbers in the array is " + oddcount);

		sc.close();
	}
}
