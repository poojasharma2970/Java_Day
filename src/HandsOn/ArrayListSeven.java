package HandsOn;

import java.util.ArrayList;

public class ArrayListSeven {

	public static void main(String[] args) {
		ArrayList<Object> arr =new ArrayList<Object>();
		
			Integer arr1=new Integer(10);
			Integer arr2=new Integer(20);
			Integer arr6=new Integer(50);
			Integer arr3=new Integer(30);
			Integer arr4=new Integer(40);
			Integer arr5=new Integer(50);
			Integer wrapperType = new Integer(90);
		    
			arr.add(arr1); 
			arr.add(arr2); 
			arr.add(arr3);
			arr.add(arr4);
			arr.add(arr5);
			arr.add(arr6);
			arr.add(wrapperType);
			
			String str="POOJA";

			arr.add(str);

			System.out.println("ARRAY LIST IS: "+arr);
			
			arr.remove(2);

			System.out.println("Array List after removing Element 2 IS: "+arr);
		 
			System.out.println("Index of 4 is : "+arr.indexOf(40));
			
			System.out.println("Index of 5 is : "+arr.lastIndexOf(50)); 	 
	}
}
