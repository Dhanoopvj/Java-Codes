package simpleproblems;

import java.util.Scanner;

public class Ordercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number: ");
int num1=sc.nextInt();
System.out.println("Enter the second number:");
int num2=sc.nextInt();
System.out.println("enter the third number: ");
int num3=sc.nextInt();
if (num1<num2 && num2<num3) {
	System.out.println("increasing order");
}
else if(num1>num2 && num2>num3) {
	System.out.println("Decreasing order");
}else if(num1==num2 && num2==num3) {
	System.out.println("All numbers are equal");
}
else {
	System.out.println("Neither incresing or decreasing");
}
	sc.close();
	}

}
