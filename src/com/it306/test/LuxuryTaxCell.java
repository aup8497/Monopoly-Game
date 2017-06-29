package com.it306.test;

/**
 * This cell represents the Luxury Tax cell. The value is the tax
 * to be collected.
 * 
 * @author Amith Kini
 *
 */

public class LuxuryTaxCell extends Cell {
	
	public LuxuryTaxCell(int pos, int value) {
		setPosition(pos);
		setName("Luxury Tax");
		setBuyable(false);
		setColourGroup("None");
		setRent(value);
		setTaxCollection(true);
	}
	
}