package com.simplilearn.collections;
import java.util.TreeSet;
import java.util.Set;
public class TreeSetDemo {

	//treeset is most important implementation in sorted set in interface
	// elements order is natural order arrnaging
	// Treeset is extended of set(Interface)and implements of sortedset
	public static void main(String[] args)
	{
		Set<String> set = new TreeSet<String>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Pineapple");
		System.out.println(set);

	
	//Methods remove, contain, size
	 System.out.println(set.size());
	 System.out.println(set.contains("Banana"));
	// we can iterate using for loop and iterator
}
}
