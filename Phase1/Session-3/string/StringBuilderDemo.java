package com.simplilearn.string;

public class StringBuilderDemo {

	public static void main(String[] args)
	{
		String str = "Hello world";
		StringBuilder s2 = new StringBuilder(str);
		System.out.println(s2.length());
		
		s2.append("Welcome");
		System.out.println(s2);
		
		// inserting at particular index
		s2.insert(11," ");
		System.out.println(s2);
		// replacing string with start and end index
		
		s2.replace(11,19," bye");
		System.out.println(s2);
		
		//reverse string
		
		System.out.println(s2.reverse());
		
	}
}
