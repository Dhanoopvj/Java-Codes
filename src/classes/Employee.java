package classes;

public class Employee {
int empid;
String empname;
String empdesgn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1 =new Employee();
emp1.empid=101;
emp1.empname="anu";
emp1.empdesgn="tester";

Employee emp2=new Employee();
emp2.empid=102;
emp2.empname="raj";
emp2.empdesgn="Dev";

System.out.println(emp1.empid+"\n"+emp1.empname+"\n"+emp1.empdesgn);
System.out.println(emp2.empid+"\n"+emp2.empname+"\n"+emp2.empdesgn);

System.out.println("\n");//to give space

Employee emp3=new Employee();
System.out.println(emp3.empid=103);
System.out.println(emp3.empname="ton");
System.out.println(emp3.empdesgn="tester");


	}

}
