package simpleproblems;

import java.util.Scanner;

public class Stringeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sor=new Scanner(System.in);
		//input the string
		System.out.println("Enter a String: ");
	String inputstring=sor.nextLine();
	//split the string into words
	String[] words=inputstring.split(" ");
	
	//print the words with even number of characters
	System.out.println("words with even number of characters");
	
	for (String word: words) {
		if (word.length()%2 ==0) {
			System.out.println(word);}
			else {
				System.out.println("error");}
		}
	
	
	sor.close();

	}

}
