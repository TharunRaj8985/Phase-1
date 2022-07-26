package com.simplilearn.collections;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args)
	{
	//hashset class implements Set Interface
	// no gurantee that constant order of elements
	// methods -- add, remove, contains, Size
	HashSet<Integer> set = new HashSet<Integer>();
	set.add(20);
	set.add(56);
	set.add(40);
	set.add(30);
	
	System.out.println(set);
	set.remove(0);
	System.out.println(set);
	// give True or False whether element is present or not
	System.out.println("element contains = "+set.contains(40));
	System.out.println(set.size());
	
	//using itertaor and for loop we can iterate to print
	}
	
}
