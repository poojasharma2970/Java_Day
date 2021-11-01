package com.lti.exceptionhandling;

import java.io.DataInputStream;
import java.io.IOException;

public class TryAndCatchDemo {

	public static void main(String[] args) {

		DataInputStream din = new DataInputStream(System.in);
		try {
		System.out.println("enter the value of a ");
		int a = Integer.parseInt(din.readLine());
		System.out.println("enter the value of b");
		int b = Integer.parseInt(din.readLine());
		int c = a/b;
		System.out.println("The result is "+c);
		}
		
		catch(NumberFormatException ne)
		{
			ne.printStackTrace();
		}
		catch(ArithmeticException ae)	
		{
			ae.printStackTrace();
		}
		
		catch(IOException ie)	
		{
			ie.printStackTrace();
		}
		
		catch(Exception e) {

		e.printStackTrace();
		}

	}

}
