package decsionstat;

public class Reverseanumber {

	public static void main(String[] args) {
		// reverse a number
		int k=256;
		int reverse=0;
		while(k !=0) {//or k>0 ,less than 0 will give output 0 
			int remainder=k%10;//256%10=6,25%10=5,2%10=2
			reverse=reverse*10+remainder;//0*10+6=6, 6*10+5=65 ,65*10+2=652
			k=k/10;//256/10 =25 25/10=2,k=2/10=0
		}
		System.out.println("The reverse of 256: "+reverse);

	}

}
