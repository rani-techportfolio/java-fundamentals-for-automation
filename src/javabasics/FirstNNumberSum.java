package javabasics.loops;

import java.util.Scanner;

//Sum of first N natural numbers
public class FirstNNumberSum {

	public static void main(String[] args) {
		int count, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the count: ");
		count = sc.nextInt();
		
		for(int i=1; i<=count; i++)
			sum =sum+i;

		System.out.println("Sum of first "+count+ " natural numbers:"+sum);
		
		sc.close();
	}

}
