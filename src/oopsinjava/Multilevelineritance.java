package oopsinjava;

class Birds{
	public void birdDetails() {
		System.out.println("Birds Details");//superclass super parent
	}
}

class Hen extends Birds{//child class of bird and parent class of chicken
	public void henMethod() {
		System.out.println("hen Details");
	
	}
}

class Chicken extends Hen{//child class of hen
	public void chickenmethod() {
		System.out.println("Chicken details");
	}
}

public class Multilevelineritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Chicken obj=new Chicken();
obj.birdDetails();
obj.henMethod();
obj.chickenmethod();
		
	}

}
