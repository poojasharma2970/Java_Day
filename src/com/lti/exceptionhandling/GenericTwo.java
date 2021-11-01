package com.lti.exceptionhandling;

public class GenericTwo {

	public static void main(String[] args) {
		Integer[] i= {1,89,96,41,25};
		String[] s= {"Hey","welcome"};
		System.out.println("Integer Array:");
		display(i);
		
		System.out.println("String array");
		display(s);
	}
	public static<E> void display(E[] elements) {
		for(E e:elements) {
			System.out.println(e);
		}
	}

}
