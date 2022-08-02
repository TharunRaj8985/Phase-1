package com.simplilearn.ExceptionHandling;

public class Handling1 {

	public static void main(String[] args) {
		int number;
		String s = "20";
		// when we feel code is risky we will use try catch method
		// it will throw an exception but not error so that application is safe
		
		try {
			number = Integer.parseInt(s);
			System.out.println(number);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured"+e);
		}
	}
}
