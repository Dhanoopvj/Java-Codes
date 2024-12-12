package oopsinjava;

public class Exceptionnew {
//runtime Exception/unchecked exception
	public static void main(String[] args) {
		
		// Exception
		try {int c=5/0 ;
		System.out.println(c);}
		catch(ArithmeticException e)//catch(Exception e){sop()}.
		{System.out.println("Division by zero is not applicable!");
		System.out.println("Hi there!");

	}
		//null pointer exception
try {
		String s=null;
		System.out.println(s.length());
}catch(Exception e) {
	System.out.println("Enter a Character");
}
//Array out of bound
int[] arry = {1,2,3,4,5};
try {
	System.out.println(arry[10]);
}catch(Exception e2) {
	System.out.println(e2.getMessage());
}
		
	}
	}
