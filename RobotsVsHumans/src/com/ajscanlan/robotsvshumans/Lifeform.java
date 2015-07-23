package com.ajscanlan.robotsvshumans;

public class Lifeform {
	private int power;
	private int uuid = 0;
	
	
	public Lifeform(int power, int uuid){
		this.power = power;
		this.uuid = uuid;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getUuid() {
		return uuid;
	}

	
}
