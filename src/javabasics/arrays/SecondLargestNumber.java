package javabasics.arrays;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " elements:");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Find the largest element in the array
		int largest = arr[0];

		for (int i = 1; i < size; i++) {

			if (arr[i] > largest)
				largest = arr[i];

		}

		// Find the second largest element in the array
		int secondlargest = arr[0];

		for (int i = 1; i < size; i++) {

			if (arr[i] > secondlargest && arr[i] != largest)
				secondlargest = arr[i];
		}
		
		System.out.println("The largest number in the array is "+largest);
		System.out.println("The second largest number in the array is "+secondlargest);
		
		sc.close();

	}

}
