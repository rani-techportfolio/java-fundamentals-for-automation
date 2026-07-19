package javabasics.methods;

import java.util.Scanner;

public class LongestWord {
	
	String str;
	
	public String readString(Scanner sc) {
		
		System.out.println("Enter the string");		
		str = sc.nextLine();
		return str;		
	}
	
	public String longestWord(String str) {
		
		String[] words = str.split("\\s+");
		
		String longest="";
		
		for(String w:words) {
			
			if(w.length()>longest.length()) {
				longest = w;
			}
		}
		return longest;		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		LongestWord lw = new LongestWord();
		
		String s = lw.readString(sc);
		
		String longestWord = lw.longestWord(s);
		
		System.out.println("Longest word in the string '"+s+"' is:"+longestWord);
		
		sc.close();
	}

}
