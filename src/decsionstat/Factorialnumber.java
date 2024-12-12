package decsionstat;

public class Factorialnumber {

	public static void main(String[] args) {
//To find a factorial of a number
		int i=5;
		int n;
		int fact=1;
		
		for(n=1;n<=i;n++) {
			fact=fact*n;//1*1=1,1*2=2,n=3--29fact)*3(n)=6
			//6*4=24 i=5 ---24*5=120
		}System.out.println("factorial of "+i +"="+fact);
	}

}
