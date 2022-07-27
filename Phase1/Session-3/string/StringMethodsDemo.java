package com.simplilearn.string;

public class StringMethodsDemo {

	public static void main(String[] args)
	{
		String str = "Hello World";
		char c = str.charAt(2);
		System.out.println(c);
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println("Check whether word contains: "+str.contains("World"));
		
		// Methods checking two strings
		
		// equals --> with casesenstive
		// equalsIgnoreCase --> without Casesensitive
	}
}
