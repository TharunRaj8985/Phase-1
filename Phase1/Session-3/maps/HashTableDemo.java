package com.simplilearn.maps;
import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {

	public static void main(String[] args)
	{
	//Hashtable availabe in Java.util package
	Hashtable<Integer,String> map  = new Hashtable<Integer,String>();
	map.put(1,"Raj");
	map.put(2, "kumar");
	map.put(3, "zoom");
	map.put(4, "gmeet");
	//map.put(5,null);  // Hashtable Doesnot allow Null values
	//map.put(null, null);
	// map.put(null, "TingTong");
	
	// Null value as key or value is not allowed in Hashtable
	// It is printing as descending order for keys
	
	System.out.println(map);
	System.out.println("Element at 1 "+ map.get(1));
	System.out.println("Element at 3 "+ map.get(3));
	System.out.println("Element at 6 "+ map.get(6));
	
	// using for loop:-
	
	for(Map.Entry m:map.entrySet())
	{
		System.out.println(m.getKey() +" , " + m.getValue());
	}
	}
	
}
