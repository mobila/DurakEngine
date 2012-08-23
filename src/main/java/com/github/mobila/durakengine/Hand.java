package com.github.mobila.durakengine;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	List<Card> trumpCards;
	
	List<Card> normalCards;
	
	Sorting sorting;
	
	public enum Sorting{
		UNSORTED, BY_RANK_LEFT, BY_RANK_RIGHT, BY_RANK_TRUMPS_LEFT, BY_RANK_TRUMPS_RIGHT
	}
	
	public Hand(Sorting sorting){
		this.sorting = sorting;
		trumpCards = new ArrayList<Card>();
		normalCards = new ArrayList<Card>();
	}
	
	public void receiveCard(Card card, boolean trump){
		if(trump){
			trumpCards.add(card);
		} else {
			normalCards.add(card);
		}
	}

	public List<Card> getTrumpCards() {
		return trumpCards;
	}

	public List<Card> getNormalCards() {
		return normalCards;
	} 
}
