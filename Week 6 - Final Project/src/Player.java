import java.util.ArrayList;
import java.util.List;

public class Player {

	static ArrayList<Card> hand = new ArrayList<>();
	int score;
	String name;
	
	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void describePlayer() {
		System.out.println("Name: " + name);
		System.out.println("Score: " + score);
		
	}
	Card draw(Deck d) {
		Card draw1 = d.drawTopCard();
		hand.add(draw1);
		return hand.remove(0);
		
	}
	
	Card flip(Deck dek, Player player) {
		
		Card playerHand = player.draw(dek);
		return playerHand;
		
	}
	
	
	public int incrementScore() {
		 return score += 1;
	}
}
