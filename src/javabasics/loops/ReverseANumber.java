package javabasics.loops;

import java.util.Scanner;

//Find the reverse of a number
public class ReverseANumber {

	public static void main(String[] args) {
		int num, reverse=0, rem;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		int temp = num;
		
		while(temp>0) {
			rem = temp%10;
			reverse = (reverse*10)+rem;
			temp=temp/10;
		}
		System.out.println("Reverse of "+num+" is "+reverse);
		
		sc.close();

	}

}
