package packg;

public class Task {

	public static void main(String[] args) {
		//1
		int a=23;
		int b=45;
		System.out.println(a==b);
		
		//2
		int c=55;
		int d=70;
		System.out.println(c<50);
		System.out.println(c<d);
		//3 without using a variable
		int x=20;
		int y=30;
		x=x+y;//20+30=50
		y=x-y;//50-30=20
		x=x-y;//50-20=30
		System.out.println("after swapping :x="+x+",y="+y);
		//4
		int p=17;
		int secondDigit=p%10;
		System.out.println("the second digit is:"+ secondDigit);

	}

}
