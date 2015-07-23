package com.conorbrennan.robotsVhumans;

public class Lifeform {
	public int power;
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	protected String uniqueID;

	@Override
	public String toString() {
		return "Lifeform [power=" + power + ", uniqueID=" + uniqueID + "]";
	}
}
