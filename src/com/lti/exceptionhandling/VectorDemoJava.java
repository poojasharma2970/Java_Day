package com.lti.exceptionhandling;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemoJava {

	public static void main(String[] args) {
		Vector<Object> vector = new Vector<Object>();

		Integer i1 = new Integer(16);
		Integer wrapperType = new Integer(29);
		String str = "Name";

		vector.add(i1);
		vector.add(wrapperType);
		vector.add(str);
		vector.add(2, new Integer(30));

		System.out.println("the elements of vector: " + vector);
		System.out.println("The Size of vector are: " + vector.size());
		System.out.println("The elements at position 2 is: "

		+ vector.elementAt(2));
		
		System.out.println("The first element of vector is: "

		+ vector.firstElement());
		
		System.out.println("The last element of vector is: "

		+ vector.lastElement());
		
		vector.removeElementAt(2);

		Enumeration e=vector.elements();

		System.out.println("The elements of vector: " + vector);
		while(e.hasMoreElements()){

		System.out.println("The elements are: " + e.nextElement());
		}

	}

}
