package javabasics.conditionallogic;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		
     int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:  ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number:  ");
		num2 = sc.nextInt();
		
		if(num1>num2) 
			System.out.println(num1 +" is greater than "+num2);
		
		else if(num2>num1)
			System.out.println(num2 +" is greater than "+num1);
		
		else
			System.out.println("Both numbers are equal");
		
		sc.close();
		
	}

}
