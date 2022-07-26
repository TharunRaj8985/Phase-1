package com.simplilearn.collections;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {

	public static void main(String[] args)
	{
	// LinkedHashSet is ordered version of HashSet
	// whenever iteration order is needed to maintain we will use this
	// While iterating elements are fetched as per they are inserted
	//do not allow Duplicates
	LinkedHashSet<String> linkhashset = new LinkedHashSet<String>();
	linkhashset.add("A");
	linkhashset.add("B");
	linkhashset.add("C");
	linkhashset.add("E");
	System.out.println(linkhashset);
	
	linkhashset.remove("B");
	System.out.println(linkhashset);
 
	System.out.println("Element Contains = "+linkhashset.contains("E"));
	
	linkhashset.add("D");
	System.out.println(linkhashset);
	
	
	}	
}
