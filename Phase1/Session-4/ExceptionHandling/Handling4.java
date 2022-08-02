package com.simplilearn.ExceptionHandling;

public class Handling4 {

	static void check(int age)
	{
		if(age>18)
		{
			System.out.println("valid for voting");
		}
		else
		{
			System.out.println("not valid for voting");
		}
	}
	static void test() throws Exception
	{
		check(14);
	}
	public static void main(String[] args)
	{
		// we have handled exception using try-catch block
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
