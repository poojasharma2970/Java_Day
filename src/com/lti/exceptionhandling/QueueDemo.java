package com.lti.exceptionhandling;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("16");
		queue.add("3");
		queue.add("7");
		
		queue.offer("Item2");
		queue.offer("8");
		queue.offer("19");
		queue.offer("5");
		queue.offer("17");

		Iterator i=queue.iterator();
		
		while(i.hasNext()){
		System.out.println(i.next());
		}
		
		System.out.println("remove: " + queue.remove());
		
		System.out.println("element: " + queue.element());
		
		System.out.println("poll: " + queue.poll());
		
		System.out.println("peek: " + queue.peek());
	}

}

//Using the add method to add items.
//Should anything go wrong an exception will be thrown.

//Using the offer method to add items.
//Should anything go wrong it will just return false


//Removing the first item from the queue.
//If the queue is empty a java.util.NoSuchElementException will be thrown.

//Checking what item is first in line without removing it

//If the queue is empty a java.util.NoSuchElementException will be thrown.
		

//Removing the first item from the queue.

//If the queue is empty the method just returns false.
		