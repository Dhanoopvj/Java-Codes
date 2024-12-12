package decsionstat;

public class Dcstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if
		int a=10,b=9;
		if(a>b) {
			System.out.println("a is greater than b");
	}
//if else
		int c=9,d=10;
		if(c<d) {
			System.out.println("C is less than d");
		}else {
			System.out.println("c is not less than d");
		}
//Nested if
		int k=55;
		if(k%11==0)
		{
			System.out.println("k is divisible by 11");
		}else {
			System.out.println("k is not divisible by 11");
		}if(k%5==0) {
			System.out.println("k is divisbile by 5");
		}else {
			System.out.println("k is not divisible by 5");
		}if(k%11==0 || k%5==0) {
			System.out.println( k +"is divisible by 11 and 5");
		}
	}
}
