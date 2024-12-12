package decsionstat;

public class Jumpingstatemnts {

	public static void main(String[] args) {
		// jumping statements are break continue and return
		//break--it is used to terminate the execution of the nearest enclosing loop or switch statement
		//when a break statement is encountered control is transfered to the statement immediately following the loop or switch
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;//exit the loop when i is 5
			}
			System.out.println(i);
		}
		//continue--it skips the current iteration of a loop and proceeds with the next iteration
//used often to skip certain condition within a loop
		for(int i=0;i<10;i++) {
			if (i==5) {
				continue;//skip the iteration when i is 5
			}
			System.out.println("\n"+i);
		}//return--it is used to exit from a method and optionally return a value when a return statement is executed 
	}//control is transfered back to the caller of the method

}
