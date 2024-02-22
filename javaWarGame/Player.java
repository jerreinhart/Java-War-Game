package javaWarGame;

import java.util.ArrayList;
import java.util.List;


public class Player {
List<Card> hand = new ArrayList<Card>();
	
	int playerScore = 0;
	 
	String name;
	
	public void describe() {
		System.out.println("Player Name: " + name);
		System.out.println("Player's Current Score: " + playerScore);
		System.out.println("Player's Hand: " + hand);
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public void incrementScore() {
		playerScore += 1;
	}

	public void setName(String name) {	
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setScore(int playerScore) {
		this.playerScore = playerScore;
	}
	public Integer getScore() {
		return playerScore;
	}

	public void playerDraw(Deck deck) {
	deck.draw();
		
	}
}
