package javaWarGame;

public class App {

	public static void main(String[] args) {
		// create a new deck and shuffle it
		Deck deck = new Deck();
		System.out.println("You have created a new deck!");
		System.out.println();
		deck.shuffle();
		System.out.println("The deck has been shuffled!");
		System.out.println();

		// create two players
		Player player1 = new Player();
		player1.setName("Phineas");
		System.out.println();
		Player player2 = new Player();
		player2.setName("Ferb");
		
		System.out.println("Begin Game!\n");

		// use a for-loop to iterate through the deck and each player draw a card
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.getHand().add(deck.draw());
			} else {
				player2.getHand().add(deck.draw());
			}
		}

		for (int j = 1; j <= 26; j++) {
			System.out.println("Round " + j + ":\n");
			
			Card card1 = player1.flip();
			System.out.print(player1.getName() + " played the " + card1.getName() + " of " + card1.getSuit()
					+ " card, which is worth " + card1.getValue() + " points\n");

			Card card2 = player2.flip();
			System.out.print(player2.getName() + " played the " + card2.getName() + " of " + card2.getSuit()
					+ " card, which is worth " + card2.getValue() + " points\n");

			System.out.println();

			// compare the cards drawn by each player, and add the value to the winner's
			// score
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " wins this round!\n");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " wins this round!\n");
			} else {
				System.out.println("Uh oh! It's a tie! Please try again.");
			}
			System.out.println(player1.getName() + " currently has " + player1.getScore() + " points.");
			System.out.println(player2.getName() + " currently has " + player2.getScore() + " points.\n");
			System.out.println("----------------------------------------------------------------------");
		}

		System.out.println();

		// compare the scores and determine the winner
		if (player1.getScore() > player2.getScore()) {
			System.out.println("And the winner, with a total of " + player1.getScore() + " points, is...");
			System.out.println(player1.getName() + "! Congratulations!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("And the winner, with a total of " + player2.getScore() + " points, is...");

			System.out.println(player2.getName() + "! Congratulations!");
		} else {
			System.out.println("It's a tie! Please play again.");
		}
	}

}
