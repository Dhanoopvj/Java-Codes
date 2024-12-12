package simpleproblems;

public class Armstrongnumber {

	public static void main(String[] args) {
		// to check if it is armstrung number
		int num =153;
		int rem;
		double sum=0;
		int n=num;
		while (n>0) {
			rem=n%10;
		 sum=sum  + Math.pow(rem,3);//rem raies to 3
			n=n/10;
		}
if (sum==num) {
	System.out.println(num+" is a Armstrong number");
}else {
	System.out.println(num+" is not an Armstrong number");
}
	}

}
