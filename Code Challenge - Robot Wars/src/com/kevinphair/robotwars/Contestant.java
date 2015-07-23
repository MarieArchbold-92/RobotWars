package com.kevinphair.robotwars;

/**
 * @author Kevin Phair, Sam Downes
 * Created 23 Jul 2015
 *
 */
public class Contestant implements Comparable<Contestant> {

	
	private int power = 0;
	private static int id = 0;
	private int objectId = 0;
	private String name = "";
	private int active = 0;
	
	public Contestant (int p, String s) {
		this.power = p;
		this.objectId = getId();
		this.active = 1;
		this.name = makeName();
		Contestant.id++;
	}
	
	public int compareTo(Contestant c) {
		int compareActive = c.getActive(); 
 
		//ascending order
		return this.active - compareActive;
 
		//descending order
		//return compareQuantity - this.quantity;
 
	}
	
	/**
	 * Gets the active status of the object
	 * @return
	 */
	public int getActive() {
		return this.active;
	}

	public void makeInactive() {
		this.active = 0;
	}

	/**
	 * Get the current power level of object
	 * @return power as int
	 */
	public int getPower() {
		return this.power;
	}
	/**
	 * Set the current power level of object
	 * @param power as int from 0 to 100 inclusive
	 */
	public void setPower(int p) {
		this.power = p;
	}

	/**
	 * Get the id (name) of the object
	 * @return id as string
	 */
	public static int getId() {
		return Contestant.id;
	}
	
	public String makeName() {
		return  "" + Contestant.id;	
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public void setName(String s) {
		this.name = s;	
	}
	
	
	
}
