package com.simplilearn.InnerClass;

public class InnerClassDemo {

	void check(int age)
	{
		if(age>=18)
		{
			class Inner
			{
				void validate()
				{
					System.out.println("Validated");
				}
			}
				Inner inn = new Inner();
				inn.validate();
		}
		else
		{
			System.out.println("Not valid");
		}
	}
	public static void main(String[] args)
	{
		InnerClassDemo outer = new InnerClassDemo();
		outer.check(12);
	}
}
