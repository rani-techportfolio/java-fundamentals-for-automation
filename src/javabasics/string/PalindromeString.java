package javabasics.string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String actual = sc.nextLine();

		int strlen = actual.length();
		String reversed = "";

		// Reverse the string
		for (int i = strlen - 1; i >= 0; i--) {
			reversed = reversed + actual.charAt(i);

		}
		// Case Sensitive
		System.out.println("Scenario 1: Case Sensitive");

		if (actual.equals(reversed))
			System.out.println(actual + " is a plaindrome string.");

		else
			System.out.println(actual + " is NOT a plaindrome string.");
		
		System.out.println("--------------------------------");

		// Not Case sensitive
		System.out.println("Scenario 2: NOT Case Sensitive");

		if (actual.equalsIgnoreCase(reversed))
			System.out.println(actual + " is a plaindrome string.");

		else
			System.out.println(actual + " is NOT a plaindrome string.");
		
		sc.close();

	}

}
