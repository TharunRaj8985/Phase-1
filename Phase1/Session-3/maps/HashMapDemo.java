package com.simplilearn.maps;

import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {

	// HashMap is implemenetation of Map
	// It Inherits HashMap Class
	// It maintains Insertion Order
	// methods:- get, remove
	public static void main(String[] args)
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Raj");
		map.put(2, "kumar");
		map.put(3, "zoom");
		map.put(4, "gmeet");
		map.put(5,null);
		map.put(null, null);
		map.put(null, "TingTong");
	// It wont allow duplicate keys
		System.out.println(map);
		System.out.println("Element at 3 "+ map.get(3));
		System.out.println("Element at 5 "+ map.get(5));
		
		//iterate using for loop
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() +" , " + m.getValue());
		}
	}
	
	
}
