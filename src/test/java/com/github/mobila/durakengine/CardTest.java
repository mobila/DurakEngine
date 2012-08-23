package com.github.mobila.durakengine;

import com.github.mobila.durakengine.Card.Rank;
import com.github.mobila.durakengine.Card.Suit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void testToString() {
		Card card = new Card(Suit.HEARTS, Rank.ACE);
		assertEquals("AH", card.toString());
		
		card = new Card(Suit.CLUBS, Rank.EIGHT);
		assertEquals("8C", card.toString());
		
		card = new Card(Suit.DIAMONDS, Rank.TEN);
		assertEquals("10D", card.toString());
		
		card = new Card(Suit.SPADES, Rank.JACK);
		assertEquals("JS", card.toString());
	}

}
