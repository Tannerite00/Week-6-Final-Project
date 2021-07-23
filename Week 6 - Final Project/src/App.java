
public class App {

	public static void main(String[] args) {
		//new players, new deck
		Player player1 = new Player("Tanner", 0);
		Player player2 = new Player("Nikki", 0);
		Deck deck = new Deck();
		
		//adding all the cards to the new deck
		Card aceOfSpades = new Card("Ace of Spades", 2);
		Card twoOfSpades = new Card("Two of Spades", 3);
		Card threeOfSpades = new Card("Three of Spades", 4);
		Card fourOfSpades = new Card("Four of Spades", 5);
		Card fiveOfSpades = new Card("Five of Spades", 6);
		Card sixOfSpades = new Card("Six of Spades", 7);
		Card sevenOfSpades = new Card("Seven of Spades", 8);
		Card eightOfSpades = new Card("Eight of Spades", 9);
		Card nineOfSpades = new Card("Nine of Spades", 10);
		Card tenOfSpades = new Card("Ten of Spades", 11);
		Card jackOfSpades = new Card("Jack of Spades", 12);
		Card queenOfSpades = new Card("Queen of Spades", 13);
		Card kingOfSpades = new Card("King of Spades", 14);
		
		
		Deck.addCard(twoOfSpades);	
		Deck.addCard(threeOfSpades);
		Deck.addCard(fourOfSpades);
		Deck.addCard(fiveOfSpades);
		Deck.addCard(sixOfSpades);
		Deck.addCard(sevenOfSpades);
		Deck.addCard(eightOfSpades);
		Deck.addCard(nineOfSpades);
		Deck.addCard(tenOfSpades);
		Deck.addCard(jackOfSpades);
		Deck.addCard(queenOfSpades);
		Deck.addCard(kingOfSpades);
		Deck.addCard(aceOfSpades);
		
		Card aceOfDiamonds = new Card("Ace of Diamonds", 2);
		Card twoOfDiamonds = new Card("Two of Diamonds", 3);
		Card threeOfDiamonds = new Card("Three of Diamonds", 4);
		Card fourOfDiamonds = new Card("Four of Diamonds", 5);
		Card fiveOfDiamonds = new Card("Five of Diamonds", 6);
		Card sixOfDiamonds = new Card("Six of Diamonds", 7);
		Card sevenOfDiamonds = new Card("Seven of Diamonds", 8);
		Card eightOfDiamonds = new Card("Eight of Diamonds", 9);
		Card nineOfDiamonds = new Card("Nine of Diamonds", 10);
		Card tenOfDiamonds = new Card("Ten of Diamonds", 11);
		Card jackOfDiamonds = new Card("Jack of Diamonds", 12);
		Card queenOfDiamonds = new Card("Queen of Diamonds", 13);
		Card kingOfDiamonds = new Card("King of Diamonds", 14);
		
		
		Deck.addCard(twoOfDiamonds);
		Deck.addCard(threeOfDiamonds);
		Deck.addCard(fourOfDiamonds);
		Deck.addCard(fiveOfDiamonds);
		Deck.addCard(sixOfDiamonds);
		Deck.addCard(sevenOfDiamonds);
		Deck.addCard(eightOfDiamonds);
		Deck.addCard(nineOfDiamonds);
		Deck.addCard(tenOfDiamonds);
		Deck.addCard(jackOfDiamonds);
		Deck.addCard(queenOfDiamonds);
		Deck.addCard(kingOfDiamonds);
		Deck.addCard(aceOfDiamonds);
		
		Card aceOfHearts = new Card("Ace of Hearts", 2);
		Card twoOfHearts = new Card("Two of Hearts", 3);
		Card threeOfHearts = new Card("Three of Hearts", 4);
		Card fourOfHearts = new Card("Four of Hearts", 5);
		Card fiveOfHearts = new Card("Five of Hearts", 6);
		Card sixOfHearts = new Card("Six of Hearts", 7);
		Card sevenOfHearts = new Card("Seven of Hearts", 8);
		Card eightOfHearts = new Card("Eight of Hearts", 9);
		Card nineOfHearts = new Card("Nine of Hearts", 10);
		Card tenOfHearts = new Card("Ten of Hearts", 11);
		Card jackOfHearts = new Card("Jack of Hearts", 12);
		Card queenOfHearts = new Card("Queen of Hearts", 13);
		Card kingOfHearts = new Card("King of Hearts", 14);
		
		
		Deck.addCard(twoOfHearts);
		Deck.addCard(threeOfHearts);
		Deck.addCard(fourOfHearts);
		Deck.addCard(fiveOfHearts);
		Deck.addCard(sixOfHearts);
		Deck.addCard(sevenOfHearts);
		Deck.addCard(eightOfHearts);
		Deck.addCard(nineOfHearts);
		Deck.addCard(tenOfHearts);
		Deck.addCard(jackOfHearts);
		Deck.addCard(queenOfHearts);
		Deck.addCard(kingOfHearts);
		Deck.addCard(aceOfHearts);
		
		Card aceOfClubs = new Card("Ace of Clubs", 2);
		Card twoOfClubs = new Card("Two of Clubs", 3);
		Card threeOfClubs = new Card("Three of Clubs", 4);
		Card fourOfClubs = new Card("Four of Clubs", 5);
		Card fiveOfClubs = new Card("Five of Clubs", 6);
		Card sixOfClubs = new Card("Six of Clubs", 7);
		Card sevenOfClubs = new Card("Seven of Clubs", 8);
		Card eightOfClubs = new Card("Eight of Clubs", 9);
		Card nineOfClubs = new Card("Nine of Clubs", 10);
		Card tenOfClubs = new Card("Ten of Clubs", 11);
		Card jackOfClubs = new Card("Jack of Clubs", 12);
		Card queenOfClubs = new Card("Queen of Clubs", 13);
		Card kingOfClubs = new Card("King of Clubs", 14);
		
		
		Deck.addCard(twoOfClubs);
		Deck.addCard(threeOfClubs);
		Deck.addCard(fourOfClubs);
		Deck.addCard(fiveOfClubs);
		Deck.addCard(sixOfClubs);
		Deck.addCard(sevenOfClubs);
		Deck.addCard(eightOfClubs);
		Deck.addCard(nineOfClubs);
		Deck.addCard(tenOfClubs);
		Deck.addCard(jackOfClubs);
		Deck.addCard(queenOfClubs);
		Deck.addCard(kingOfClubs);
		Deck.addCard(aceOfClubs);
		
		//shuffling the deck
		deck.shuffle();
		
		//testing the describe feature for cards. it works. 
		aceOfSpades.describe();
		
		
		//iteration through the card list to prove that it has 52 cards
		for(int j = 0; j < 52; j++) {
			Card player2Hand = player2.draw(deck);
			System.out.println(player2Hand.name);
			Deck.addCard(player2Hand);
		}
		
		
		//playing the game. 
		for(int i = 0; i < 26; i++) {
			int counter = i + 1;
			
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
