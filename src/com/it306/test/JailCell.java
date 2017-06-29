package com.it306.test;

/**
 * The Jail cell.
 * 
 * @author Amith Kini
 *
 */

public class JailCell extends Cell {
	
	public JailCell(int pos) {
		setPosition(pos);
		setName("Jail");
		setBuyable(false);
		setColourGroup("None");
	}
	
}
