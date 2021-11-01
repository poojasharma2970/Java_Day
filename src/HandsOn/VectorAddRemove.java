package HandsOn;

import java.util.Vector;

public class VectorAddRemove {

	public static void main(String[] args) {
		Vector<Object> vector = new Vector<Object>();
		
		Integer v1 = new Integer(21);
		Integer v2 = new Integer(561);
		Integer v3 = new Integer(5);

		Integer wrapperType = new Integer(90);

		String str = "POOJA";

		vector.add(v1);
		vector.add(wrapperType);
		vector.add(str);
		vector.add(v2);
		vector.add(v3);
		vector.add(2, new Integer(50));
		 
		System.out.println("The Elements of vector is : \n " + vector);
		 
		vector.remove(3);
		System.out.println("The Elements of vector after removing 4th element is : \n " + vector);	 

	}

}
