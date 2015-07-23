package com.ajscanlan.robotsvshumans;

public class Lifeform {
	private float power;
	private int uuid = 0;
	private boolean isAlive = true;
	
	public Lifeform(int power, int uuid){
		this.power = power;
		this.uuid = uuid;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float f) {
		this.power = f;
	}

	public int getUuid() {
		return uuid;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	
}
