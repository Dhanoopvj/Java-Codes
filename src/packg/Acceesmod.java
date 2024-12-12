package packg;

public class Acceesmod {

		private int s=10;//only within same class
	int a;//default//within same package
	protected int b=96;//within same package and subclass(inherit use )
	public int king=100;//accessed anywhere
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Acceesmod obj1=new Acceesmod();
System.out.println("private: " + obj1.s);
obj1.a=12;	
System.out.println("default:"+obj1.a);
System.out.println("protected: "+obj1.b);
	System.out.println("public: "+obj1.king);
	
	}
	
}
