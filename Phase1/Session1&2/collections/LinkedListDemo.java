package com.simplilearn.collections;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		// Linkedlist is a part of collection Frmaework in java.present in java.util package
		// It is Linear Data structure and elements are not stored in contigious memory location.
		// Every element is separate object with data part and address.
		// every element is linked with pointer and address
		// each element is called node
		// due to dynamically insertion and deletion these are most preferable than arrays.
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(56);
		list.add(70);
		list.add(45);
		list.add(20);
		System.out.println("Size of list is"+list.size());
		list.remove(3);
		System.out.println("After removing size of list is "+list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		list.add(3,35);
		System.out.println(list);
		
		System.out.println("First Element is"+list.getFirst());
		System.out.println("Last element is"+list.getLast());
	}
	// we can iterorate using for loop
	// we can iteroate using iterator also
	
}
