package javabasics.methods;

import java.util.Scanner;

public class FirstNonRepeatedChar {
	
	public String readString(Scanner sc) {
		
		System.out.println("Enter the string");
		String str = sc.nextLine().toLowerCase();
		return str;		
	}
	
	public void findFirstNonRepeatedChar(String str) {
		
		
		
		for(int i=0; i<str.length(); i++) {
			
			boolean isRepeated = false;
			
			char current = str.charAt(i);

            // Ignore spaces
            if(current == ' ')
                continue;
			
			for(int j=0; j<str.length(); j++) {
				
				if(i!=j && current==str.charAt(j)) {
					
					isRepeated = true;
					break;
				}
			}
			if(!isRepeated) {
				System.out.println("The first non-repeated character: "+current);			
			break;
			
		}
		}	
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		FirstNonRepeatedChar obj = new FirstNonRepeatedChar();
		
		String str = obj.readString(sc);
		
		obj.findFirstNonRepeatedChar(str);

	}

}
