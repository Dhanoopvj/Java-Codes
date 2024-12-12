package simpleproblems;


public class Fibonnaci {

	public static void main(String[] args) {
		// fibonnaci sequence
		int a=0;
		int b=1;
System.out.println("fibonacci series upto 100: ");
while (a<=100)//loop continue as long as it is less than equal to 100
{
	System.out.println(a++ );
}
int c=a+b;//calculate the 3 rd term by adding
a=b;//a is updated tp b
b=c;//b is updated tp c
	}

}
