package simpleproblems;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a =str.nextLine();
		
		String[] words = a.split(" ");
        String reversed = "";
        
       for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
	}

    System.out.println("Reversed string: " + reversed);
str.close();
    
	}

}
