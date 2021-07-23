import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private static ArrayList<Card> cards = new ArrayList<>();
	
		
	 static void addCard(Card c) {
		cards.add(c);
	}
		
	
	static void shuffle() {
		Collections.shuffle(cards);
	}
	
	Card drawTopCard() {
		return cards.remove(0);
	}


}