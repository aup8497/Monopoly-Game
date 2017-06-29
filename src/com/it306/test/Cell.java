package com.it306.test;

/**
 * This is an abstract class which describes the property needed for a
 * cell on the board. Colour group and owner is in the ArrayList type.
 * 
 * @author Amith Kini
 */


public abstract class Cell {
	private int position;
	private String name;
	private int value = 0;
	private int rent = 0;
	private String owner = "Bank";		//The default value for all property at the start
	private boolean buyable = true;		//Change this for chance block and community chest blocks.
	private String colourGroup;
	private boolean chance = false;
	private boolean community_chest = false;
	private boolean taxCollection = false;

	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public boolean isBuyable() {
		return buyable;
	}
	public void setBuyable(boolean buyable) {
		this.buyable = buyable;
	}
	
	public String getColourGroup() {
		return colourGroup;
	}
	public void setColourGroup(String colourGroup) {
		this.colourGroup = colourGroup;
	}
	
	public boolean isChance() {
		return chance;
	}
	public void setChance(boolean chance) {
		this.chance = chance;
	}

	public boolean isCommunity_chest() {
		return community_chest;
	}
	public void setCommunity_chest(boolean community_chest) {
		this.community_chest = community_chest;
	}
	
	public boolean isTaxCollection() {
		return taxCollection;
	}
	
	public void setTaxCollection(boolean taxCollection) {
		this.taxCollection = taxCollection;
	}
}
