package decsionstat;

public class Countofnumber {

	public static void main(String[] args) {
//To check the count of the number
		int j=5876;
		int count=0;
		//loop the count of the digits
		while (j>0) {
			j=j/10;
			count++;
		}
		System.out.println("The number of digits is: "+ count);
	}

}
