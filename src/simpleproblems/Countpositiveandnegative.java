package simpleproblems;

import java.util.Scanner;

public class Countpositiveandnegative {
//count positive negative and zeros in inputs
	public static void main(String[] args) {
		Scanner countpn= new Scanner(System.in);
		int countpositive=0;
		int countnegative=0;
		int countzero=0;
		
		System.out.println("Enter numbers(a to stop): ");
		
		while (true) {//This loop continues until the user enters 'a'.
			if(countpn.hasNextInt())//Checks if the next input is an integer.

			{
			int number= countpn.nextInt();//Reads the next integer.
	
			if (number>0) {
				countpositive++;
			}
			else if (number<0) {
				countnegative++;
		}else {
		countzero++;
		}
			} else  {
				String str =countpn.next();
				if(str.equalsIgnoreCase("a")){ 
					break;
				}else {
			System.out.println("invalid input enter a number");
			}
		}
	}
System.out.println("Number of positive numbers: "+ countpositive);
System.out.println("Number of negative nummbers: "+ countnegative);
System.out.println("Number of zeros: "+ countzero);
	
countpn.close();

	}
}
