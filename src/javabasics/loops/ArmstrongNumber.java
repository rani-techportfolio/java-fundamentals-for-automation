package javabasics.loops;

import java.util.Scanner;

public class ArmstrongNumber{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;

        // Step 1: Count the number of digits in the number
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: Calculate Armstrong sum
        temp = num;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;

            sum += (int) Math.pow(digit, count); //Math.pow returns a double

            temp = temp / 10;
        }

        // Step 3: Compare the calculated sum with the original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is NOT an Armstrong Number");
        }

        sc.close();
    }
}
