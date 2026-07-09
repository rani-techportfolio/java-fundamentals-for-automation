package javabasics.string;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String[] words = str.trim().split("\\s+");
        
        int wordcount = words.length;
        
        System.out.println("Number of words: "+wordcount);
        
        sc.close();
	}

}
