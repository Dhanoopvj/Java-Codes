package decsionstat;

import java.util.Scanner;

public class Tocheckoddoreven {

	public static void main(String[] args) {
		int n ;		
		System.out.println("Enter a number: ");
		// to check if the number is odd or even
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		
		if(n%2==0) {
			System.out.println(n+" is an even number");
		}else if(n==0){
			System.out.println(n+"is neither odd nor even");
		}
		else {
		
			System.out.println(n+" is odd number");
		}

	sc.close();}

}
