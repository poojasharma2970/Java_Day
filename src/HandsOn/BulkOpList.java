package HandsOn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BulkOpList {

	public static void main(String[] args) {
		// containsAll, addAll, removeAll, clear
		
		HashSet<String> Set=new HashSet<String>(); 
       
		Set.add("Welcome");
		Set.add("To");
		Set.add("LTI");
		Set.add("AND"); 
		Set.add("Warm");
		Set.add("Welcome2");
		Set.add("To");
		Set.add("TSL");

        System.out.println("Elements in hash Set List is : \n"+Set); 
        
        //System.out.println(Set.containsAll(Set));
        //System.out.println(Set.addAll(Set));
        //Set.removeAll();
        //Set.clear(S);
        
        List<String> list = new ArrayList<>();
        list.add("Welcome");
        list.add("To");
        list.add("LTI");
        list.add("AND"); 
        list.add("Warm");
        list.add("Welcome");
        list.add("To");
        list.add("TSL");
         
        System.out.println("\nElements in Array List is : \n"+list); 
        
        //System.out.println(list.containsAll(list));
        //System.out.println(list.addAll(list));
        //list.removeAll();
        //list.clear(S);
        

	}

}
