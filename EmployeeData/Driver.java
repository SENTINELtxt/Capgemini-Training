package EmployeeData;

public class Driver {
public static void main(String[] args) {
	Employee e1 = new Employee("Bhargab",15000,8756465440l);
	Employee e2 = new Employee("Rajat",48000,8756465460l);
	Employee e3 = new Employee("Lash",9000,8756465450l);
	System.out.println(e1.name+"\t"+e1.salary+"\t"+e1.mob);
	System.out.println(e2.name+"\t"+e2.salary+"\t"+e2.mob);
	System.out.println(e3.name+"\t"+e3.salary+"\t"+e3.mob);
	
}
}
