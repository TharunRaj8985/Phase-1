package com.simplilearn.serialization;

import java.io.Serializable;
// converting data to byte stream is serialization
// if we dont want to create serialization we need to keep transient keyword before variable
public class Student implements Serializable{

	private int id;
	private String name;
	private transient String email;
	private String password;
	
	public Student(int id,String name,String email,String password)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public void display()
	{
		System.out.println(id+" "+name +" " +email+ " "+ password);
	}
	public static void main(String[] args)
	{
		Student s1 = new Student(1,"Tharun","raj@gmail.com","hdjnddhs");
		s1.display();
	}
}
