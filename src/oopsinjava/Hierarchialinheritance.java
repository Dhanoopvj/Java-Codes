package oopsinjava;
//bas class
class Animal{
	public void eat() {
		System.out.println("The animal eats food");
	}
}
//derived class 1
class Lion extends Animal{
	public void roar() {
		System.out.println("the lion roars");
	}
}
//derived class 2
class ducks extends Animal{
	public void quack() {
		System.out.println("the duck quacks");
		
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {
	Lion lion=new Lion();
	lion.eat(); //inherited method
	lion.roar();//Specified to Lion class

	ducks ducks=new ducks();
	ducks.eat();//inherited method
	ducks.quack();//Specific to ducks class
	}

}
/* in this both Lion and ducks  classes inherit from the Animal class 
The Animal class provide a common method eat() and each derived class(lion and ducks)
has its own specific method roar() and quack(). */