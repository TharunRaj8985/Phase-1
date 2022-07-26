
//queue is extension to queue
// prirority queue doesn't allow null value
// queue retrival operations are called remove,peek,poll
package com.simplilearn.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
				
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.add(56);
		pQueue.add(70);
		pQueue.add(45);
		pQueue.add(20);
		
		//print Priority queue
		
		System.out.println(pQueue);
		
		//printing first element
		System.out.println("Printing top elemenet is "+ pQueue.peek());
		
		//print first element and remove top element
		System.out.println("Printing top elemenet and removing top element is "+ pQueue.poll());
		
		pQueue.remove(56);
		System.out.println(pQueue);
		
		
		// we can iterate using for loop
		// we can iterate using iterator
	}
}
		
		
