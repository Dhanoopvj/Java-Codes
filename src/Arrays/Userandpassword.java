package Arrays;

import java.util.Scanner;

public class Userandpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner(System.in);
		String[][] userst=new String[3][2];
	for(int i=0;i<3;i++) {
		System.out.println("Enter the username "+(i+1)+":");
		userst[i][0]=user.nextLine();
		System.out.println("Enter the password for "+userst[i][0]+ ":");
		userst[i][1]=user.nextLine();
	}
	System.out.println("\nStored Usernames and passwords: ");
	for (int i=0; i<3; i++) {
		System.out.println(userst[i][0]+" "+userst[i][1]);
	}
user.close();
	}

}
