package javabasics.loops;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked: ");
		num = sc.nextInt();
		
		boolean isPrime = true;

        if (num <= 1) 
            isPrime = false;
        
        else {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) 
            System.out.println(num + " is a prime number");
        
        else 
            System.out.println(num + " is NOT a prime number");
        

        sc.close();

	}

}
