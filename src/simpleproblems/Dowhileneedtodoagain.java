package simpleproblems;

import java.util.Scanner;

public class Dowhileneedtodoagain {

	public static void main(String[] args) {
		// using do while perform addition and show option to perform again
		Scanner koju=new Scanner(System.in);
char choice;
do
{
	System.out.println("Enter the first number: ");
	int num1=koju.nextInt();
	System.out.println("Enter the second number: ");
	int num2=koju.nextInt();
	
	int sum=num1+num2;
	System.out.println("The sum is: "+sum);
	
	System.out.println("do you need to perform again?(y/n)");
	choice=koju.next().charAt(0);
}
while
	(choice=='y' || choice=='Y');

	koju.close();
	}

}

