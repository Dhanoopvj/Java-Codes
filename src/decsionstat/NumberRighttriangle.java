package decsionstat;

public class NumberRighttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=1;i<=4;i++) {//row=4
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}

	}

}
