package com.it306.test;

/**
 * This is the Class file for the Chance cards and the
 * community chest cards.
 * 
 * @author Amith Kini
 *
 */


public class Card {
	
	public String message;
	public int value;
	public int pos;
	
	public Card(String msg, int v, int pos) {
		this.message = msg;
		this.value = v;
		this.pos = pos;
	}
	
}
