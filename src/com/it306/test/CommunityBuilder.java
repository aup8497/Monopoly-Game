package com.it306.test;

/**
 * The community chest cards.
 * 
 * @author Amith Kini
 */

import java.util.ArrayList;

public class CommunityBuilder {
	
	public ArrayList<Card> communityCards = new ArrayList<Card>();
	
	public ArrayList<Card> build() {
		
		Card a = new Card("Advance to GO",0,0);
		communityCards.add(a);
		
		Card b = new Card("Bank error in your favour, collect $200",200,-1);
		communityCards.add(b);
		
		Card c = new Card("Doctor's fees, pay $200",-200,-1);
		communityCards.add(c);
		
		Card d = new Card("You sell your stocks, collect $50",50,-1);
		communityCards.add(d);
		
		Card e = new Card("Go to Jail",0,30);
		communityCards.add(e);
		
		Card f = new Card("Holiday fund matures, collect $100",100,-1);
		communityCards.add(f);
		
		Card g = new Card("It is your birthday, collect $40",40,-1);
		communityCards.add(g);
		
		Card h = new Card("Life insurance matures, collect $100",100,-1);
		communityCards.add(h);
		
		Card i = new Card("You inherit your ancestor's money, collect $100",100,-1);
		communityCards.add(i);
		
		return communityCards;
		
	}
	
}
