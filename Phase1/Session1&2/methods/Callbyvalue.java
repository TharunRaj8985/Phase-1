package com.simplilearn.methods;


public class Callbyvalue {

// class level variable access using this keyword	
	int  num1 = 50;
	void operation(int num)
	{
		//if parameter not passed it will take default value
		this.num1 = num*10/100;
	}
	public static void main(String[] args)
	{
		Callbyvalue c= new Callbyvalue();
		System.out.println("Before Function call "+ c.num1);
		c.operation(100);
		System.out.println("After calling function "+ c.num1);
	}
}
