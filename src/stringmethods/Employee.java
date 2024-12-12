package stringmethods;
// constructor to initialize the instance variable

public class Employee {
	String empname;
	int empid;
	
	public Employee (int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}

	public static void main(String[] args) {
		//create an instance of Employee
		Employee emp=new Employee(101,"anu");
		System.out.println(emp.empid);
		System.out.println(emp.empname);

	}

}
