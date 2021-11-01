package HandsOn;

import java.util.ArrayList;
import java.util.List;

public class SubListArray {

	public static void main(String[] args) {
		ArrayList<String>arr = new ArrayList<String>();

		arr.add("P");
		arr.add("O");
		arr.add("0");
		arr.add("J");
		arr.add("A");

        System.out.println("Original Array list: " + arr);
     
        List<String> subArr = arr.subList(1, 4);
        System.out.println("Sublist of Array list: "   + subArr);

	}

}


