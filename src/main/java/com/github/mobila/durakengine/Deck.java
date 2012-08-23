package com.github.mobila.durakengine;

import java.util.Collections;
import java.util.Stack;

public class Deck extends Stack<Card> {
	
	public Deck(int numberOfCards){
		for(Suit suit : Suit.values()){
			for(Rank rank : Rank.values()){
				if(numberOfCards==36 && Rank.SIX.compareTo(rank)>0){
					continue;
				}
				this.add(new Card(suit, rank));
			}
		}
		
		Collections.shuffle(this);
	}
}
