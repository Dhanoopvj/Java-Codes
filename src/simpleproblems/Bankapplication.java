package simpleproblems;

import java.util.Scanner;

interface BankAccount{
	public void enterAccountDetails(String accountNumber,String accountHolder);
	double viewBalance();
	String deposit (double amount);
	String withdraw(double amount);
}
class BankAccounts implements BankAccount {
	public String accountNumber;
	public String accountHolder;
	public double balance;
	@Override
	public void enterAccountDetails(String accountNumber, String accountHolder) {
		// TODO Auto-generated method stub
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=10000.00;
	}
	@Override
	public double viewBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	@Override
	public String deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount >0) {
			balance = balance+amount;
			return "Deposited: "+amount;
		}
		else {
			return "Deposited amount must be positive";
		}
		
	}
	@Override
	public String withdraw(double amount) {
		if( amount>0 && amount<= balance) {
			balance = balance-amount;
			return "withdrawn:"+amount;
		}else {
			return "withdrawal must be positive and greater than zero";
		}
	}
}
public class Bankapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
BankAccount account=new BankAccounts();

System.out.println("Enter your ACC Number: ");
String accountNumber=obj.next();
System.out.println("Enter your Name: ");
String accountHolder=obj.next();
account.enterAccountDetails(accountNumber, accountHolder);

while (true) {
	System.out.println("HDFC bank ");
	System.out.println("1. view balance");
	System.out.println("2. deposit");
	System.out.println("3. withdraw");
	System.out.println("4.Exit");
	System.out.println("choose ann option:");
	int choice =obj.nextInt();
	switch (choice) {
	case 1:
		System.out.println("current Balance:"+account.viewBalance());
		break;
	case 2:
		System.out.println("Enter deposit amount: ");
		double depositAmount=obj.nextDouble();
		System.out.println(account.deposit(depositAmount));
		break;
	case 3:
		System.out.println("Enter withdrawal amount: ");
		double withdrawAmount=obj.nextDouble();
		System.out.println(account.withdraw(withdrawAmount));
		break;
	case 4:
		System.out.println("thak you for using the APP");
		obj.close();
		System.exit(0);
		default:
			System.out.println("invalid entry try again");
	}
}
	}

}
