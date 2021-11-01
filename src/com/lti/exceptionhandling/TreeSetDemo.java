package com.lti.exceptionhandling;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

public static void main(String[] args) {
		
		System.out.println(" Tree Set Example!\n ");
		TreeSet <Integer>tree = new TreeSet<Integer>();
		
		tree.add(12);
		tree.add(34);
		tree.add(45);
		tree.add(23);
		tree.add(9);

		Iterator iterator;

		iterator = tree.iterator();
		System.out.print("Tree set data: ");

		while (iterator.hasNext()){
		System.out.print(iterator.next() + " ");
		}

		System.out.println();

		if (tree.isEmpty()){
		System.out.print("Tree Set is empty.");
		}

		else{
		System.out.println("Tree Set size: " + tree.size());
		}

		System.out.println("First data: " + tree.first());
		
		System.out.println("Last data: " + tree.last());

		if (tree.remove(30)){
		System.out.println("Data is removed from tree set");
		}

		else {
		System.out.println("Data doesn't exist!");
		}

		System.out.print("Now the tree set contain: ");
		iterator = tree.iterator();

		while (iterator.hasNext()){
		System.out.print(iterator.next() + " ");
		}

		System.out.println();
		System.out.println("Now the size of tree set: " + tree.size());
	}
}
