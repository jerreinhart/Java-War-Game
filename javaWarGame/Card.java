package javaWarGame;

public class Card {
	//initialize fields	
		public String name;
		public String suit;
		int value;
	//use a constructor to create a card	
		public Card(String suit, String name, int value) {
			this.suit = suit;
			this.name = name;
			this.value = value;
		}
			
			/* switch (value) {
			case 2 :
				name = "Two";
			break;
			case 3 :
				name = "Three";
			break;
			case 4 :
				name = "Four";
			break;
			case 5 :
				name = "Five";
			break;
			case 6 :
				name = "Six";
			break;
			case 7 :
				name = "Seven";
			break;
			case 8 :
				name = "Eight";
			break;
			case 9 :
				name = "Nine";
			break;
			case 10 :
				name = "Ten";
			break;
			case 11 : 
				name = "Jack";
			break;
			case 12 :
				name = "Queen";
			break;
			case 13 :
				name = "King";
			break;
			case 14 :
				name = "Ace";
			break;
			default :
				System.out.println("This is not a valid input.");
			}
		} */
		
	//create a method that returns the card's full name	
		public String combineName() {
				return name;
			}

	//create a method to describe a card
		public void describeCard() {
			 System.out.println(name);
		}
		
	//create getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name += (" of " + suit);
		}

		public String getSuit() {
			return suit;
		}

		public void setSuit(String suit) {
			this.suit = suit;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
}
