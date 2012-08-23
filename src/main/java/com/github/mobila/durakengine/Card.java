package com.github.mobila.durakengine;

public class Card {
	
	public enum Suit {
		HEARTS, CLUBS, DIAMONDS, SPADES
	}
	
	public enum Rank {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	private Suit suit;
	
	private Rank rank;
	
	public Card (Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;
	}
	
	public Suit getSuit() {
		return suit;
	}


	public Rank getRank() {
		return rank;
	}

	@Override
	public String toString() {
		if(getRank().compareTo(Rank.TEN)>0){
			return getRank().name().substring(0, 1)+getSuit().name().substring(0, 1);
		} else {
			return String.valueOf(getRank().ordinal()+2)+getSuit().toString().substring(0, 1);
		}
		
	}

	

}
