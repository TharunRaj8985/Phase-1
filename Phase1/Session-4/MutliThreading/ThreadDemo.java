package com.simplilearn.MutliThreading;

// Thread is public class
// Thread has inbuilt run method but we are using our run method. This is called Method Overloading
public class ThreadDemo extends Thread {

	public void run()
	{
		System.out.println("Thread Started");
	}
	public static void main(String[] args)
	{
		ThreadDemo t1 = new ThreadDemo();
		
		ThreadDemo t2 = new ThreadDemo();
		t1.run(); // Method Overloading
		t2.start(); // Here we are using run Method Present inside thread Class
	}
}
