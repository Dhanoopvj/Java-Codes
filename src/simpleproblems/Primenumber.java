package simpleproblems;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// Primenumber
		Scanner prime=new Scanner(System.in);
System.out.println("Enter a number: ");
int number =prime.nextInt();
int a=1;

if (number<=1)
{
	a=0;
}
else {for (int i=2;i<=number/2;i++)
{if (number %i==0) {a=0;

}
}
	}
if (a==1)
{System.out.println(number+" is a prime number");}
else {
System.out.println(number+" is not a prime ");
}
prime.close();

	}

}
