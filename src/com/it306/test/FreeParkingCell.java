package com.it306.test;

/**
 * The free parking cell.
 * 
 * @author Amith Kini
 *
 */

public class FreeParkingCell extends Cell {

	public FreeParkingCell(int pos) {
		setPosition(pos);
		setName("Free Parking");
		setBuyable(false);
		setColourGroup("None");
	}
	
}
