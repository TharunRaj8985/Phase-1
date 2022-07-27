package com.simplilearn.string;

public class StringBufferdemo {
 
	public static void main(String[] args)
	{
		String str = "Hello World";
		
		//converting string to string buffer
		
		StringBuffer s1 = new StringBuffer(str);
		System.out.println("size of string s1 is "+ s1.length());
		
		s1.append("Welcome");
		System.out.println(s1);
		
		// inserting at particular index
		s1.insert(11," ");
		System.out.println(s1);
		// replacing string with start and end index
		
		s1.replace(11,19," bye");
		System.out.println(s1);
		
		//reverse string
		
		System.out.println(s1.reverse());
		
	}
	
	
}
