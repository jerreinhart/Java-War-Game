package javaWarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//initialize fields
		List<Card> cards = new ArrayList<Card>(52);
		String[] suits = { "Hearts", "Spades", "Diamonds" + "Clubs" };
		int[] valueNumbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

	//create constructor
		public Deck() {
			for (String suit : suits) {
				int index = 0;
				for (Integer number : valueNumbers) {
					cards.add(new Card(suit, number));
					index++;
				}
			}
		}

	//create method to randomize cards
		public void shuffle() {
			Collections.shuffle(cards);
		}

	//create method to return and remove the top card	
		public Card draw() {
			return cards.remove(0);
		}

	//getters & setters
		public List<Card> getCards() {
			return cards;
		}

		public void setCards(List<Card> cards) {
			this.cards = cards;
		}
}
