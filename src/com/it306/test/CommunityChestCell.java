package com.it306.test;

/**
 * This is the community chest cell. More methods and arguments to be added.
 * @author Amith Kini
 *
 */

public class CommunityChestCell extends Cell {
	
	public CommunityChestCell(int pos) {
		
		setPosition(pos);
		setName("Community Chest");
		setBuyable(false);
		setColourGroup("None");
		setCommunity_chest(true);
	}
		
}
