package javabasics.string;

import java.util.Scanner;

public class StringAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int specialChars = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                vowels++;

            } else if (Character.isLetter(ch)) {

                consonants++;

            } else if (Character.isDigit(ch)) {

                digits++;

            } else if (ch == ' ') {

                spaces++;

            } else {

                specialChars++;
            }
        }

        System.out.println("Number of vowels = " + vowels);
        System.out.println("Number of consonants = " + consonants);
        System.out.println("Number of digits = " + digits);
        System.out.println("Number of spaces = " + spaces);
        System.out.println("Number of special characters = " + specialChars);

        sc.close();
    }
}
