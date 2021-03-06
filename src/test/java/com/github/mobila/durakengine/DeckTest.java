package com.github.mobila.durakengine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.mobila.durakengine.Deck.NumberOfCards;

public class DeckTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Deck deck = new Deck(NumberOfCards.N36);
		assertEquals(36, deck.size());
		
		deck = new Deck(NumberOfCards.N52);
		assertEquals(52, deck.size());
	}

}
