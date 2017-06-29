package com.it306.test;

/** 
 * Class for Income Tax cell. The value is the tax amount to be collected.
 * @author Amith Kini
 *
 */

public class IncomeTaxCell extends Cell {
	
	public IncomeTaxCell(int pos, int value) {
		setPosition(pos);
		setName("Income Tax");
		setBuyable(false);
		setColourGroup("None");
		setRent(value);
		setTaxCollection(true);
	}
	
}
