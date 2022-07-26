//innner class Example

package com.simplilearn.InnerClass;

public class ValidEmailId {

	void check(String lock_key)
	{
		if(lock_key.equals("tharun123@gmail.com"))
		{
			class Inner
			{
				void validate()
				{
					System.out.println("User Found and Authenticated");
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
	    ValidEmailId outer = new ValidEmailId();
		outer.check("tharun123@gmail.com");
	}
}
