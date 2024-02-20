package javaWarGame;


public class App {

	public static void main(String[] args) {
		//create a new deck and shuffle it
				Deck deck = new Deck();
					System.out.println("You have created a new deck!");
					System.out.println();
				deck.shuffle();
					System.out.println("The deck has been shuffled!");
					System.out.println();
					
		//create two players
				Player player1 = new Player();
					player1.setName("Phineas");
					System.out.println();
				Player player2 = new Player();
					player2.setName("Ferb");
				
		//use a for-loop to iterate through the deck and each player draw a card
				for(int i = 0; i < 52; i++) {
					if (i % 2 == 0) {
						player1.playerDraw(deck);
					} else {
						player2.playerDraw(deck);
					}
				}
				
				for(int j = 0; j < 26; j++) {
					Card card1 = new Card(" ", 0);
						 card1 = player1.flip(card1);
					System.out.println(player1.getName() + " played The ");
						card1.describeCard();
						System.out.print(" card, which is worth " + card1.getValue()+ " points");
					Card card2 = new Card(" ", 0);
					player2.flip(card2);
					System.out.println(player2.getName() + " played The ");
					card2.describeCard();
					System.out.print(" card, which is worth " + card2.getValue() + " points");
					System.out.println();

		//compare the cards drawn by each player, and add the value to the winner's score			
				if(card1.getValue() > card2.getValue()) {
					player1.incrementScore();
					System.out.println(player1.getName() + " wins this round!");
				} else if(card1.getValue() < card2.getValue()) {
					player2.incrementScore();	
					System.out.println(player2.getName() + " wins this round!");
				} else {
					System.out.println("Uh oh! It's a tie! Please try again.");
					}
				System.out.println(player1.getName() + " currently has " + player1.getScore() + " points.");
				System.out.println(player2.getName() + " currently has " + player2.getScore() + " points.");
				}
				
		//print out both player's scores
				System.out.println();
				System.out.println(player1.getName() + "'s Score is " + player1.getScore());
				System.out.println(player2.getName() + "'s Score is " + player2.getScore());
				System.out.println();
				
		//compare the scores and determine the winner		
				if(player1.getScore() > player2.getScore()) {
			 System.out.println("Congratulations! " + player1.getName() + " wins!");
			} else if(player1.getScore() < player2.getScore()) {
				System.out.println("Congratulations! " + player2.getName() + " wins!");
			} else {
				System.out.println("It's a tie! Please play again.");
				}
			}
		


	}

}
