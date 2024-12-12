package oopsinjava;

public class Methodoverloadings {

	public static void main(String[] args) {
		// methodoverloading
		Methodoverloadings obj1 = new Methodoverloadings();
		obj1.add();
		obj1.add(20.7, 10);
		obj1.add(10, 10.50);
		obj1.add(50,5);
		
	}
public void add() {
	int a=10,b=20,c;
	c=a+b;
	System.out.println(c);
}
public void add(int a,int b) {
	int c=a+b;
	System.out.println(c);
	
}
	public void add(int a,double b) {
		double c=a+b;
	System.out.println(c);
	
	}
	public void add(double a,int b) {
		double c=a+b;
		System.out.println(c);
	}
	
}
