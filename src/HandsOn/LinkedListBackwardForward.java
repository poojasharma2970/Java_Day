package HandsOn;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBackwardForward {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		int size;
		list.add("10");		  //Adding data in the list
		list.add("20");
		list.add("30");
		list.add("40");
		
		System.out.println("The Elements are "+list);
		
		ListIterator<String> lit;
		lit = list.listIterator();
		
		System.out.println("The List in Forward Direction are: ");
		while (lit.hasNext()){
			 System.out.println(lit.next()+" ");
		}
		
		System.out.println("The List in Backward Direction are: ");
		  while(lit.hasPrevious()){
		      System.out.println(lit.previous());
		}	
		
	}

}
