package com.it306.test;

/**
 * This is the chance cell. More methods and arguments to be added.
 * @author Amith Kini
 *
 */

public class ChanceCell extends Cell {

	public ChanceCell(int pos) {
		setPosition(pos);
		setName("Chance");
		setBuyable(false);
		setColourGroup("None");
		setChance(true);
	}
	
}
