package simpleproblems;

import java.util.Scanner;

public class Pallindromestring {

	public static void main(String[] args) {
		// pallindrome strings
// Initialize word and reverse as empty strings

		String word="",reverse="";
 // Create a Scanner object for reading input

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string: ");
 // Read the input string from the user

		word =obj.nextLine();
		// Get the length of the input string		
		int length=word.length();
        // Loop to reverse the input string

		for(int i= length-1;i>=0;i--)
			reverse=reverse+word.charAt(i);
		// Add each character to reverse string starting from the end		
        // Check if the original string is equal to the reversed string (case-insensitive)

		if(word.equalsIgnoreCase(reverse))
		
			System.out.println(word+" is a pallindrome");
		else 
			System.out.println(word+" is not a pallindrome");
			
	obj.close();
	
	}

}
