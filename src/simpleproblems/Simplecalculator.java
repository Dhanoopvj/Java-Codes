package simpleproblems;

import java.util.Scanner;

public class Simplecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner calc=new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1=calc.nextInt();
		System.out.println("Enter the second number: ");
		int num2=calc.nextInt();
		
		System.out.println("choose an operator(+,-,*,/)+ :");
		char operator =calc.next().charAt(0);//the next(),charAt(0) method reads the next 
		//input as a string and takes the first character of a string
	int result;
	//perform the user to enter the operator
	switch(operator) {
	case'+':
		result =num1 + num2;
		System.out.println( num1 + "+" +num2+ "="+ result);
		break;
	case'-':
		result=num1 - num2;
		System.out.println(num1+"-"+num2+"="+ result);
		break;
	case'*':
		result=num1*num2;
		System.out.println(num1+"*"+num2+"="+ result);
		break;
	case'%':
		result=num1/num2;
		System.out.println(num1+"/"+num2+"="+ result);
		break;
		default :
			System.out.println("Invalid input");
	}
	calc.close();
	}

}
