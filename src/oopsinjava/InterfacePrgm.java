package oopsinjava;
interface Vehicle{//interface class 1
	public void acceleration();
	void speedlimit();
	void torque();
	void enginedetails();
}
interface Vehicle2{//interface class 2
	public void namesofcar();
}
class carDetails implements Vehicle,Vehicle2{// interface to interface multiple inheritance "," use chyam instead of extends
	public void acceleration() {
		System.out.println("accelaration of car");
	}
	@Override
	public void speedlimit() {
		System.out.println("80kmph");
	}
	@Override
	public void torque() {
		System.out.println("76hp");
	}
	@Override
	public void enginedetails() {
		System.out.println("engine litre:5L");
	}
	@Override
	public void namesofcar() {
		System.out.println("Name of car: MazhaCar");
	}
}
public class InterfacePrgm {
	public static void main(String[] args) {
Vehicle mycar=new carDetails();
mycar.acceleration();
mycar.enginedetails();
mycar.speedlimit();
mycar.torque();
Vehicle2 mycar2=new carDetails();
mycar2.namesofcar();
	}

}
