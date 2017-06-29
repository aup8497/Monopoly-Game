package com.it306.test;

/**
 * The chance cards.
 * 
 * @author Amith Kini
 */

import java.util.ArrayList;

public class ChanceBuilder {
	
	public ArrayList<Card> chanceCards = new ArrayList<Card>();
	
	public ArrayList<Card> build() {
		
		Card a = new Card("Advance to GO",0,0);
		chanceCards.add(a);
		
		Card b = new Card("Advance to Illinois Avenue",0,24);
		chanceCards.add(b);
		
		Card c = new Card("Advance to St. Charles Place",0,11);
		chanceCards.add(c);
		
		Card d = new Card("Bank pays you dividend, collect $50",50,-1);
		chanceCards.add(d);
		
		Card e = new Card("Go to Jail",0,30);
		chanceCards.add(e);
		
		Card f = new Card("Make general repairs on all your property, pay $25",-25,-1);
		chanceCards.add(f);
		
		Card g = new Card("Pay poor tax of $15",-15,-1);
		chanceCards.add(g);
		
		Card h = new Card("Take a trip to Reading Railroad",0,5);
		chanceCards.add(h);
		
		Card i = new Card("You won a crossword competition, collect $100",100,-1);
		chanceCards.add(i);
		
		return chanceCards;
		
	}
	
}
