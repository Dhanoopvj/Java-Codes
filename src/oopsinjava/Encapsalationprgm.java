package oopsinjava;

class employeeNew {
    private String empname;
    private String empDesignation;
    private int empid;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
}

public class Encapsalationprgm {
    public static void main(String[] args) {
        employeeNew ob = new employeeNew();
        ob.setEmpDesignation("dev");
        ob.setEmpid(101);
        ob.setEmpname("ABC");

        System.out.println(ob.getEmpid());
        System.out.println(ob.getEmpname());
        System.out.println(ob.getEmpDesignation());
    }
}
