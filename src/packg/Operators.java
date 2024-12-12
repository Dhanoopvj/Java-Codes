package packg;

public class Operators {

	public static void main(String[] args) {
		// operators
		int a=25 , b=15;
		System.out.println("a+b="+(a+b));//40
		System.out.println("a-b="+(a-b));//10
		System.out.println("a/b="+(a/b));//1
		System.out.println("a*b="+(a*b));//375
		System.out.println("a%b="+(a%b));//10
		
		//Assignment operators
		int c=a;//25
		System.out.println(a+=b);//25+15
		System.out.println(a-=b);//40-15
		
		//relational operators
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		//logical operators
		String username="abcdef";
		String password="abc@123";
		System.out.println((username=="abcdef")&&(password=="abc@123"));
		System.out.println((username=="efghi")&&(password=="abc@123"));
		System.out.println(password=="abc1");
		
		//unary operators
		int c1=10,c2=20;
		//c1++ means post incremental
		//++cl means pre incremental
		//--c1 means pre decremental
		//c1-- means post decremetal
		
		System.out.println(c1++);//10
		System.out.println(c1);//11
		System.out.println(++c1);//12
		System.out.println(c1--);//12
		System.out.println(c1);//11
		System.out.println(--c1);//10
		
		//ternary operators
		//syntax variable=condition"exp1:exp2";
		String v=c2>c1?"c2 is larger":"c1 is larger";
		System.out.println(v);
		
		

	}

}
