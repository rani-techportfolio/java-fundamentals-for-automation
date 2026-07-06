package javabasics.conditionallogic;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:  ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number:  ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;

            case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;

            case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;

            case '/': if (num2 != 0) 
                    System.out.println("Result: " + (num1 / num2));
                
                    else 
                    System.out.println("Cannot divide by zero");
                    break;

            default:
                   System.out.println("Invalid operator");
        }

        sc.close();
		
		

		
	}

}
