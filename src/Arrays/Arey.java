package Arrays;

import java.util.Scanner;

public class Arey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ar=new Scanner(System.in);
System.out.println("Enter the size of the Array: ");
int size =ar.nextInt();
int[]rry=new int[size];
System.out.println("enter" + size +"elements: ");
for (int i=0; i<size;i++) {
	rry[i]=ar.nextInt();
	
}
System.out.println("The elements of the array are: ");
for (int i=0;i<size;i++) {
	System.out.println( rry[i] );
}
ar.close();
	}

}
