package javabasics.loops;

import java.util.Scanner;

public class InvertedStarPyramid {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();

		for (int i = rows; i >=1; i--) {
			
			//Printing spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			
			//Printing stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		sc.close();

	}

}
