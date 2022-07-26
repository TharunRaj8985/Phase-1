package com.simplilearn.constructors;

public class Employee {

	int empid;
	String empname;
	String department;
	float salary;
	public Employee()
	{
		empid=001;
		empname="Tharun";
		department="INF";
		salary=50000;		
	}
	public Employee(int empid,String empname, String department, float salary)
	{
		this.empid =empid;
		this.empname = empname;
		this.department = department;
		this.salary = salary;
	}
	public void display()
	{
		System.out.print("Empid is"+ empid);
		System.out.println("Employye name is"+ empname);
		System.out.println("Department is"+ department);
	  System.out.println("Salary is"+salary);
	}
	public static void main(String[] args)
	{
		// calling default constructor
		Employee ee = new Employee();
		ee.display();
		//calling parameterized constructor
		// we can use for many employyess
		Employee e1 = new Employee(002,"Kumar","DFL",5000000);
		e1.display();
		Employee e2 = new Employee(003,"Singh","Temp",10000);
		e2.display();
		
	}
}

