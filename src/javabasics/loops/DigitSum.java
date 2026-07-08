package javabasics.loops;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		int num, sum=0, remainder, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		
		temp = num;
		
		while(temp>0) {
			remainder = temp%10;
			sum = sum+remainder;
			temp = temp/10;
		}
		
		System.out.println("Sum of digits in "+num+" is "+sum);
		
		sc.close();

	}

}
