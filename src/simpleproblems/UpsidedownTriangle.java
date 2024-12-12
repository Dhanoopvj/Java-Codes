package simpleproblems;

public class UpsidedownTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for (int i=1;i<=n;i++)//start from 1 and goes to n=5 controlling the row number
	{
	for (int j=n;j>=i;j--) {//print the current row number (i) from n down to i
		System.out.print(i+" ");}
	
System.out.println();
	}
	}
}
