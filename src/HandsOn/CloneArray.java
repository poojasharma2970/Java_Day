package HandsOn;

import java.util.ArrayList;

public class CloneArray {

	public static void main(String[] args) {
		ArrayList<Object> a =new ArrayList<Object>();
		
		Integer arr1=new Integer(1);
		Integer arr2=new Integer(2);
		Integer arr3=new Integer(3);
		Integer arr4=new Integer(4);
		Integer arr5=new Integer(5);
		
		a.add(arr1); 
		a.add(arr2); 
		a.add(arr3);
		a.add(arr4);
		a.add(arr5);
		
		Object arrClone = a.clone();
		
		a.remove(2);

		System.out.println("ORIGINAl ARRAY : "+a);

		System.out.println("CLONE ARRAY: "+arrClone);
		
		if(arrClone.equals(a))
			System.out.println("Equal");
		else
		    System.out.println("Not Equal");


	}


}
