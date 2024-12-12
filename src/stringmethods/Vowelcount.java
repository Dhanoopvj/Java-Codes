package stringmethods;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		//vowel count
		System.out.println("Enter the word: ");
		Scanner wrd=new Scanner(System.in);
		
		String s=wrd.next();//this line reads word entered by the user and stores it in the variable s
		
		Vowelcount v=new Vowelcount();
		
int count=v.vowelCount(s);		
		System.out.println("number of vowels in the word:"+count);
				wrd.close();
	}

//this declares a method named vowelcount that takes a string parameter s and returns the integer
	public int vowelCount(String s) {
		int count=0;
		for (int i=0;i<s.length();i++) {//this line ittrates over each character in the string s
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u')
			{count++;
			}//this lines check if the current character is avowel if it is the counter count is incremented by 1
			}

	return count;//this line retuen the total count of vowels
	}
}
