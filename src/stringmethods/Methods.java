package stringmethods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methods obj=new Methods();
obj.add();
obj.sub();
obj.mul(20, 30);
obj.div(20, 5);
System.out.println(obj.div(20, 5));
	}

	//methods without return and without parameter add(0
	public void add()
	{int a=10,b=20,c;
	c=a+b;
	System.out.println(c);
	}
	//methods with return and without parameter sub()
	public void sub() 
	{int a=50,b=30,c;
 c=a-b;
 System.out.println(c);
	}
	//method without return type and with parameter mul()
	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	//method with return type and with parameter div()
	public double div(int a , int b)
	{
		int d=a/b;
		return d;
	}
}
