package HandsOn;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DuplicatesList {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		for(int i=0;i<10;i++) {
			list.add(String.valueOf(i));
		}
		for (int i=0;i<5;i++) {
			list.add(String.valueOf(i));
		}
		System.out.println("My list is :"+list);
		System.out.println("\nDuplicate elements from My list : " + findDuplicates(list));
   }
	
	public static Set<String> findDuplicates(List<String> listContainingDuplicates) {
			 
		final Set<String> setToReturn = new HashSet<String>();
		final Set<String> set1 = new HashSet<String>();
	 
		for (String yourInt : listContainingDuplicates) {
			if (!set1.add(yourInt)) {
					setToReturn.add(yourInt);
			}
		}
		return setToReturn;
		
	}

}
