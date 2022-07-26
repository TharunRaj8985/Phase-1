package com.simplilearn.methods;

public class Methods1 {

	public void print()
	{
		System.out.println("without return type and arguments ");
	}
	public void display(String name)
	{
		System.out.println("My name is "+ name);
	}
	public int cube(int n)
	{
		return n*n*n;
	}
	public String fullname(String Firstname, String Lastname)
	{
		return Firstname+" "+Lastname;
	}
	public static void main(String[] args)
	{
		Methods1 obj = new Methods1();
		obj.print();
		obj.display("Tharun Raj");
		int cu = obj.cube(5);
		String Fname = obj.fullname("Tharun","Raj");
		System.out.println("Value of cube is "+cu);
		System.out.println("Fullname is "+ Fname);
		
		
	}
}
