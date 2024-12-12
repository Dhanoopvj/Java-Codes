package decsionstat;

public class Revreseanumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=876;
int reverse=0;
int rem;
while(n>0) {
	rem=n%10;
	reverse=reverse*10+rem;
	n=n/10;
}
System.out.println("reverse os 876: "+reverse);
	}

}
