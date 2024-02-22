package javaWarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//initialize fields
		List<Card> cards = new ArrayList<Card>(52);
		String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
		String[] valueNumbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

	//create constructor
		public Deck() {
			for (String suit : suits) {
				int index = 2;
				for (String number : valueNumbers) {
					cards.add(new Card(suit, number, index));
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
