package com.simplilearn.CustomException;

public class customexception {

	static void check(int age) throws AgenotValidException
	{
	
		if(age<18)
		{
			throw new AgenotValidException("User Cannot Vote");
		}
		else
		{
			System.out.println("User can vote");
		}
	}
	public static void main(String[] args) {
		try {
			check(14);
		} catch (AgenotValidException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
	}
}
