package classes;

import java.util.Scanner;

public class Scnnrclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b =sc.nextInt();
int c=a+b;
System.out.println("Sum of the given number: " + c);
sc.close();
	}

}
