package Arrays;

import java.util.Scanner;

public class AryAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
System.out.println("Enter the size of the Array: ");
int size =sc.nextInt();

int [] aor=new int[size];
System.out.println("Enter the "+size +"values_: ");
	for (int i=0;i<size;i++)
	{
		aor[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<size;i++) {
		sum=sum+aor[i];
		
	}
	int average=(int)sum/size;
	System.out.println("Sum of the array: "+sum);
	System.out.println("Average of the array elements: "+ average);

	sc.close();
	}

}
