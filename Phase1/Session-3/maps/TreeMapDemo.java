package com.simplilearn.maps;
import java.util.TreeMap;
import java.util.Map;


public class TreeMapDemo {

	// Null key is not accepted but null value is accepted in TreeMap
	// Insertion order is maintained
  public static void main(String[] args)
  {
	  TreeMap<Integer,String> map = new TreeMap<Integer,String>();
	  map.put(1,"Raj");
		map.put(2, "kumar");
		map.put(3, "zoom");
		map.put(4, "gmeet");
				
		System.out.println(map);
		System.out.println("Element at 1 "+ map.get(1));
		System.out.println("Element at 3 "+ map.get(3));
		System.out.println("Element at 6 "+ map.get(6));
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() +" , " + m.getValue());
		}
  }
}