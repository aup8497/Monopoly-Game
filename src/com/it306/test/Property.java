package com.it306.test;

/**
 * The property class. Extends Cell and adds method to store
 * Player object reference.
 * @author Amith Kini
 *
 */

public class Property extends Cell{
	
	private Player powner;
	
	public Property(String name, int pos, int value, String colourGroup){
		setName(name);
		setPosition(pos);
		setValue(value);
		setRent(value/10);
		setColourGroup(colourGroup);
	}

	public Player getPowner() {
		return powner;
	}

	public void setPowner(Player powner) {
		this.powner = powner;
	}
}
