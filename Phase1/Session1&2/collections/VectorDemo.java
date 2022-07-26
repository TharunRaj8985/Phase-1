package com.simplilearn.collections;

//import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {

	public static void main(String[] args)
	{
		Vector<String> list= new Vector<String>();
		
	    System.out.println("Size of list before adding elements "+list.size());
	    list.add("Apple");
	    list.add("Banana");
	    list.add("grape");
	    list.add("Apple"); //list allows duplicate
	    list.add(null); //null can be added
	    System.out.println("after adding size of list is "+list.size());
	    System.out.println(list);
	    System.out.println(list.get(0));
	    list.add("Pineapple");
	    System.out.println(list);
	    list.remove(0);
	    list.remove(null);
	    
	    //print list using for loop
	    
	    for(String s:list)
	    {
	    	System.out.println("Using for loop "+s);
	    }

	    //print using Iterator
	    Iterator<String> itr = list.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println("Using iterator"+itr.next());
	    }
	}
}
