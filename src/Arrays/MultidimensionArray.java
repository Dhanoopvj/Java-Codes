package Arrays;

import java.util.Scanner;

public class MultidimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]mltArry=new int[3][2];
		Scanner mlt=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<2;j++)
			{
				mltArry[i][j]=mlt.nextInt();
			}
		}//this nested for loop iterates through each element of the 2d array mltArry for each element,
		//it reads an integer from the user and assigns it to the array.
		

		System.out.println("The array is: ");
		
		for (int i=0;i<3;i++)
		{for (int j=0;j<2;j++)//This nested for loop iterates through each element of the array and prints it.After printing
			//all elements in a row it moves to the next line to print the next row
		{
			System.out.print(mltArry[i][j]+" ");
		}
		
	System.out.println();
		}mlt.close();
	}
}