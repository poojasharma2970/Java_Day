package com.lti.exceptionhandling;
import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) throws NumberFormatException,AgeException, Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		if (age<1 || age>100) {
			throw new AgeException(age);
		}else {
			System.out.println("Age is valid "+age);
		}
	}

}
