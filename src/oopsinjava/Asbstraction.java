package oopsinjava;
abstract class Cars {
    abstract public void acceleration();
    public void carEngine() {
        System.out.println("Engine Details");
    }
}

class Kia extends Cars {
    @Override
    public void acceleration() {
        System.out.println("Kia Acceleration");
    }
    public void colour() {
        System.out.println("Kia colour");
    }
}
class Eon extends Cars {
    @Override
    public void acceleration() {
        System.out.println("Eon Acceleration");
    }
    public void colour() {
        System.out.println("Eon colour");
    }
}


public class Asbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kia ob=new Kia();
ob.carEngine();
ob.acceleration();
ob.colour();
Eon ob1=new Eon();
ob1.acceleration();
ob1.colour();
ob1.carEngine();
	}

}
