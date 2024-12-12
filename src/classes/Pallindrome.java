package classes;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a Number: ");
Scanner pc =new Scanner(System.in);
int number =pc.nextInt();
int orginalnumber=number;//store the number to a variable
int reverse=0;//a variable to store the reverse number
int remin;//variable to store the remainder
while (number!=0) {//Start the loop as long as the number is not zero
	remin=number%10;//takes the last digit of the number and store it in remin.
	reverse =reverse*10+remin;//appends the extracted digit and store it in the reverse variable
	number=number/10;//removes the last digit from number
}
if (orginalnumber==reverse) {
	System.out.println(orginalnumber+" is a pallindrome");
}else {
	System.out.println(orginalnumber+ "it is not a pallindrome.");
}
	pc.close();
	}

}
