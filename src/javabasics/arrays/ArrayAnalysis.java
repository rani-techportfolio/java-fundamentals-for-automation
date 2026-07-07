package javabasics.arrays;

import java.util.Scanner;

public class ArrayAnalysis {

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

		// Find sum of array elements
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}

		System.out.println("Sum of elements in the array = " + sum);

		// Finding the largest number in the array
		int largest = arr[0];

		for (int i = 1; i < size; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println("Largest number in the array is " + largest);

		// Finding the smallest number in the array
		int smallest = arr[0];

		for (int i = 1; i < size; i++) {

			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		System.out.println("Smallest number in the array is " + smallest);
		
		// Finding the average of array elements 
		
		double average = (double) sum/size;
		
		System.out.println("Average of the elements in the array is " + average);
		
		sc.close();

	}

}
