package simpleproblems;

public class Test4 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		   System.out.println("Even Numbers:");
		    for (int number : numbers) {
		         if (number % 2 == 0) {
		     System.out.print(number + " "); }}
		        System.out.println("\nOdd Numbers:");
		        for (int number : numbers) {
		            if (number % 2 != 0) {
		                System.out.print(number + " "); }
		    }}

}
