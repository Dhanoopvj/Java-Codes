package decsionstat;

public class Largestnumber {

	public static void main(String[] args) {
		// To find the largest number
		int x=10;
		int y=9;
		int z=8;
		if(x>y && x>z) {
			System.out.println("largest number is " + x);
		}else if(y>z && y>x) {
			System.out.println("largest number is "+y);
		}else {
			System.out.println("largest number is "+z);
		}

	}

}
