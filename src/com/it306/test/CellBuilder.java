package com.it306.test;

/**
 * This class is used to create the
 * cells and assign them to their respective cells.
 * Generated using Python code at /src/media 
 * @author Amith Kini
 */

import java.util.ArrayList;

public class CellBuilder {
	
	public ArrayList<Object> cellList = new ArrayList<Object>();
	
	public ArrayList<Object> read() {
		
		// Fill this up with a python code ;)
		// Filled it! File at /src/media
		cellList.add(new GOCell());
		cellList.add(new Property("Medittaranean Avenue",1,60,"Brown"));
		cellList.add(new CommunityChestCell(2));
		cellList.add(new Property("Baltic Avenue",3,60,"Brown"));
		cellList.add(new IncomeTaxCell(4,200));
		cellList.add(new Property("Reading RailRoad",5,200,null));
		cellList.add(new Property("Oriental Avenue",6,100,"Blue"));
		cellList.add(new ChanceCell(7));
		cellList.add(new Property("Vermont Avenue",8,100,"Blue"));
		cellList.add(new Property("Connecticut Avenue",9,120,"Blue"));
		cellList.add(new FreeParkingCell(10));
		cellList.add(new Property("St. Charles Place",11,140,"Pink"));
		cellList.add(new Property("Electric Company",12,150,null));
		cellList.add(new Property("States Avenue",13,140,"Pink"));
		cellList.add(new Property("Virginia Avenue",14,160,"Pink"));
		cellList.add(new Property("Pennsylvenia RailRoad",15,200,null));
		cellList.add(new Property("St. James Place",16,180,"Orange"));
		cellList.add(new CommunityChestCell(17));
		cellList.add(new Property("Tennessee Avenue",18,180,"Orange"));
		cellList.add(new Property("New York Avenue",19,200,"Orange"));
		cellList.add(new FreeParkingCell(20));
		cellList.add(new Property("Kentucky Avenue",21,220,"Red"));
		cellList.add(new ChanceCell(22));
		cellList.add(new Property("Indiana Avenue",23,220,"Red"));
		cellList.add(new Property("Illinois Avenue",24,240,"Red"));
		cellList.add(new Property("B & O RailRoad",25,200,null));
		cellList.add(new Property("Atlantic Avenue",26,260,"Yellow"));
		cellList.add(new Property("Ventnor Avenue",27,260,"Yellow"));
		cellList.add(new Property("Water Works",28,150,null));
		cellList.add(new Property("Marvin Gardens",29,280,"Yellow"));
		cellList.add(new JailCell(30));
		cellList.add(new Property("Pacific Avenue",31,300,"Green"));
		cellList.add(new Property("North Carolina Avenue",32,300,"Green"));
		cellList.add(new CommunityChestCell(33));
		cellList.add(new Property("Pennsylvenia Avenue",34,320,"Green"));
		cellList.add(new Property("Short Line",35,200,null));
		cellList.add(new ChanceCell(36));
		cellList.add(new Property("Park Place",37,350,"Navy"));
		cellList.add(new LuxuryTaxCell(38,100));
		cellList.add(new Property("Boardwalk",39,400,"Navy"));
		
		return cellList;
	}
}
