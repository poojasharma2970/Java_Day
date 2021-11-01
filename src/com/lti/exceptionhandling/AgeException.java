package com.lti.exceptionhandling;

public class AgeException extends Exception{

		int age;
		public AgeException(int age) {	
			System.out.println("Age Should be Greater than 1 or less than 100 "+age);
		}

	

}
