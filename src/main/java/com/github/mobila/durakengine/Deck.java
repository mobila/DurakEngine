package com.github.mobila.durakengine;

import java.util.Collections;
import java.util.Stack;

import com.github.mobila.durakengine.Card.Rank;
import com.github.mobila.durakengine.Card.Suit;

/**
 * This class simply represents the deck of cards as an stack. It can create a deck of 36 or 52 cards.
 * The deck is already shuffled after the creation.
 * @author mobila
 *
 */
public class Deck extends Stack<Card> {
	
	public enum NumberOfCards{
		N36, N52
	}
	/**
	 * Creates a deck of 36 or 52 cards.
	 * @param numberOfCards
	 */
	public Deck(NumberOfCards number){
		for(Suit suit : Suit.values()){
			for(Rank rank : Rank.values()){
				//In case of 
				if(number.equals(NumberOfCards.N36) && Rank.SIX.compareTo(rank)>0){
					continue;
				} 
				this.add(new Card(suit, rank));
			}
		}		
		Collections.shuffle(this);
	}
}
