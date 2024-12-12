package simpleproblems;

public class UpsidedownTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i=n;i>=1;i--)//start from n=5 and decrements to 1 controlling the number of rows
			{
			for (int j=1;j<=i;j++) {//prints numbers from 1 to i in each row
				System.out.print(j+" ");}
			
		System.out.println();//moves to next line after printing all number in current row
			}
	}

}
