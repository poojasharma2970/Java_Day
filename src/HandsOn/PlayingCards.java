package HandsOn;

import java.util.ArrayList;
import java.util.Collections;

public class PlayingCards {

public static final int DECK_SIZE = 52; 
	
	public static void main(String[] args) {
			ArrayList<Integer> deck = new ArrayList<Integer>();

	        for (int i = 0; i < DECK_SIZE; ++i) {
	            deck.add(i);
	        }

	        Collections.shuffle(deck);

	        System.out.println(deck);

		}

}
