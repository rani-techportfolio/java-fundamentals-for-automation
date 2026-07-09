
package javabasics.string;

import java.util.Scanner;

public class CountOccurrences {
	
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter the sentence: ");
	    	String text = sc.nextLine();
	    	
	    	System.out.println("Enter the character you want to search: ");
	    	char ch = sc.next().charAt(0);
	    	
	    	System.out.println("Enter the word you want to search: ");
	    	String searchWord = sc.next();
	    		    	  
	        int charCount = 0;
	        int wordCount = 0;

	        // Count character occurrence
	        for (int i = 0; i < text.length(); i++) {
	        	
	            if (text.charAt(i) == ch) {
	                charCount++;
	            }
	        }

	        // Count word occurrence
	        String[] words = text.trim().split("\\s+");

	        for (String w : words) {
	        	
	            w = w.replaceAll("[^a-zA-Z]", ""); // Remove characters other than alphabet
	            
	            //String result = str.replaceAll("[^a-zA-Z0-9]", ""); Replacing all junk/special characters
	            // String result = str.replaceAll("\\s+", "");  Replacing all whitespace characters
	            
	            if (w.equals(searchWord)) {
	            	
	                wordCount++;
	            }
	        }

	        System.out.println("Number of occurrence of '" + ch + "' : " + charCount);
	        System.out.println("Number of occurrence of '" + searchWord + "':" + wordCount);
	        
	        sc.close();
	    }
	}
