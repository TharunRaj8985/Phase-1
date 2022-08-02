package com.simplilearn.ExceptionHandling;

public class Mutliplecatch {

	public static void main(String[] args) {
		try {
		int result = 10/8;
		System.out.println("result is "+ result);
		
		int arr[] = {1,2,3,4,5};
		System.out.println("Index at 5" +arr[3]);
		
		String name = null;
		name.equals("User");
		
		Thread.sleep(1000);
	}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic Execption: "+e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Issue: "+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Object is Null: "+e.getMessage());
		}
		catch(InterruptedException e) {
			System.out.println("Error Working with Thread: "+e.getMessage());
		}
		//should keep  it last always else it will show error for remaining things
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error occured: "+e.getMessage());
		}
}
}
