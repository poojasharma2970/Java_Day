package HandsOn;

import java.util.Collections;
import java.util.LinkedList;

public class QuestionFourList {

	public static void main(String[] args) {
		
	  LinkedList<String> list = new LinkedList<String>();
	  list.add("a");
	  list.add("d");
	  list.add("b");
	  list.add("c");
	  System.out.println("The Elements are "+list);
	  Collections.sort(list);    
	  for(String str: list)   
	  System.out.print(" "+str);  
	  
	  Collections.shuffle(list); 
	  System.out.println("\n");
	  System.out.println("list after shuffling : " + list);
	  
	  Collections.reverse(list);
      System.out.println("reverse" +list);
        
      Collections.swap(list, 1, 2);
      System.out.println("\nAfter swap(mylist, 1, 2) : \n"+ list);
	  
	  Collections.fill(list,"Java");  
	  System.out.println("\n");
      System.out.println("List elements after Replacements: "+list); 
      
	}

}
