package oopsinjava;

class Car{
	public void displayMethod()
	{
		System.out.println("car details");
	}
}

class Bmw extends Car{
public void bmwDetails()
{
	System.out.println("bmw car details");
}
}

//main method-->
	public class Singleinheritance {

	public static void main(String[] args) {
		// Single inheritance
Bmw obj=new Bmw();
obj.displayMethod();//parent class method
obj.bmwDetails();//child class method
	}

}
