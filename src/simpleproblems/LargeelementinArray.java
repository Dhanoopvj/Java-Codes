package simpleproblems;

import java.util.Scanner;

public class LargeelementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements in an  array: ");
int n=sc.nextInt();
int[]arr=new int[n];
System.out.println("Enter the elements of an array: ");
for (int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int largest=arr[0];
for(int i=1;i<arr.length;i++) {
	if (arr[i]>largest){
		largest=arr[i];
	}
}
System.out.println("largest elemsent in array: "+largest);
	sc.close();
	}

}
