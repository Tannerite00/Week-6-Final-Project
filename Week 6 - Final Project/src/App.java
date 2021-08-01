

public class App {

	public static void main(String[] args) {
		//new players, new deck
		Player player1 = new Player("Tanner", 0);
		Player player2 = new Player("Nikki", 0);
		Deck deck = new Deck();
		
		//adding all the cards to the new deck
		deck.buildDeck();
		
		//shuffling the deck
		deck.shuffle();
		
		
		
		
		//iteration through the card list to prove that it has 52 cards
		for(int j = 0; j < 52; j++) {
			Card player2Hand = player2.draw(deck);
			System.out.println(player2Hand.name);
			Deck.addCard(player2Hand);
		}
		
		
		//playing the game. 
		for(int i = 0; i < 26; i++) {
			int counter = i + 1;
			
			System.out.println("***********************");
			System.out.println("ROUND " + counter);
		Card player1Hand = player1.flip(deck, player1);
		System.out.println(player1.name + "'s card: " + player1Hand.name + ", " + "Value: " + player1Hand.value);
		
		Card player2Hand = player2.flip(deck, player2);
		System.out.println(player2.name + "'s card: " + player2Hand.name + ", " + "Value: " + player2Hand.value);
		
		if (player1Hand.value > player2Hand.value) {
			player1.incrementScore();
			System.out.println(player1.name + " Wins!");
			System.out.println(player1.name + "'s score: " + player1.score );
			System.out.println(player2.name + "'s score: " + player2.score );
		} else if (player2Hand.value > player1Hand.value) {
			player2.incrementScore();
			System.out.println(player2.name + " Wins!");
			System.out.println(player1.name + "'s score: " + player1.score );
			System.out.println(player2.name + "'s score: " + player2.score );
		} else if(player1Hand.value == player2Hand.value) {
			System.out.println("It is a tie! no one gets points!");
			System.out.println(player1.name + "'s score: " + player1.score );
			System.out.println(player2.name + "'s score: " + player2.score );
		} else {
			break;
		}
		
		}
		if (player1.score > player2.score) {
			System.out.println("****************************************");
			System.out.println(player1.name + "'s Final Score: " + player1.score);
			System.out.println(player2.name + "'s Final Score: " + player2.score);
			System.out.println(player1.name + " Wins!!!");
		} else if (player2.score > player1.score) {
			System.out.println("****************************************");
			System.out.println(player1.name + "'s Final Score: " + player1.score);
			System.out.println(player2.name + "'s Final Score: " + player2.score);
			System.out.println(player2.name + " Wins!!!");
		} else {
			System.out.println("****************************************");
			System.out.println(player1.name + "'s Final Score: " + player1.score);
			System.out.println(player2.name + "'s Final Score: " + player2.score);
			System.out.println("It's a tie game!!");
		}
	}

	

}
