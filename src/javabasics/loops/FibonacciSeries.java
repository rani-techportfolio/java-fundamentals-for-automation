package javabasics.loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the count: ");
		int count = sc.nextInt();

		int a = 0;
		int b = 1;

		if (count <= 0) 
			System.out.println("Enter a positive number");
		
		else if (count == 1) 
			System.out.println(a);
		
		else if (count == 2) {
			System.out.println(a + " " + b);
		} 
		else {

			System.out.print(a + " " + b + " ");

			for (int i = 3; i <= count; i++) {
				int c = a + b;
				System.out.print(c + " ");

				a = b;
				b = c;
			}
		}

		sc.close();

	}

}
