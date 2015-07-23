package com.kevinphair.robotwars;

/**
 * @author Kevin Phair, Sam Downes
 * Created 23 Jul 2015
 *
 */
public class Contestant {

	int power = 0;
	String id = "";
	boolean active = false;
	
	public Contestant (int p, String s) {
		this.power = p;
		this.id = s;
		this.active = true;
	}
	
	/**
	 * Gets the active status of the object
	 * @return
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * Get the current power level of object
	 * @return power as int
	 */
	public int getPower() {
		return power;
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
	public String getId() {
		return id;
	}
	
}
