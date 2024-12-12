package oopsinjava;

class  Parents{
public void job() {
System.out.println("Doctor");
}

public void phone() {
	System.out.println("Samsung");
}
}
class Child  extends Parents{

@Override
	public void job() {
System.out.println("Engineer");
	super.job();
	}

	@Override
	public void phone() {
System.out.println("Nokia");
		super.phone();
	}
}

public class Methodoverriding {
	public static void main(String[] args) {
Child obj=new Child();
obj.job();
obj.phone();
	}

}
