package oopsinjava;
//hierarchical inheritance
//problem 1
/*create a class named member having members name,age,phone number,address,salary 
 * it also has a method "print details" which print all the details of the members.2calsses employ and manager 
 * inherits the member class the employ and manager classes have data members,specialization and departments respectively
 *  assign values to an employ and manager by making an object of both of these class and print the same
 */

class Member{
	String name;
	int age;
	long phoneNumber;
	String addres;
	double salary;

public void printDetails() {
	System.out.println("name:"+ name);
	System.out.println("age: "+ age);
	System.out.println("phoneNumber: "+phoneNumber);
	System.out.println("Address:"+ addres);
	System.out.println("salary:"+salary);
}
}
class Employee extends Member{
	String spcialization;
}
class Manager extends Member{
	String departments;
}


public class Members {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.name="raju";
		employee.age=25;
		employee.phoneNumber=9876543210L;
employee.addres="banker street";
employee.salary=100000;
employee.spcialization="software tester";

Manager manager=new Manager();
manager.name="dinkan";
manager.age=25;
manager.phoneNumber=9516234870L;
manager.addres="new jersey ";
manager.salary=20000;
manager.departments="developer";

System.out.println("Employee Details: " +"\n");
employee.printDetails();
System.out.println("spcialization: "+employee.spcialization);

System.out.println("\n"+"Manager Details: "+"\n");
manager.printDetails();
System.out.println("Department: "+manager.departments);

	}

}
