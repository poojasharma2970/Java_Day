package com.lti.exceptionhandling;

public class GenericOne {

	public static void main(String[] args) {
		MyGeneric<String> m=new MyGeneric<String>();
		m.add("Hey");
		System.out.println(m.get());
		
		MyGeneric<Integer> m1=new MyGeneric<Integer>();
		m1.add(100);
		System.out.println(m1.get());
	}

}

class MyGeneric<T>{
	T obj;// String obj
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}

}
