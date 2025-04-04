package EmployeeData;

public class Employee {
	String name;
	double salary;
	long mob;
	Employee(){
		
	}
	Employee(String name)
	{
		this.name = name;
	}
	Employee(String name,double salary,long mob)
	{
		this.name = name;
		this.salary = salary;
		this.mob = mob;
	}

}
