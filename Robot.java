package com.mubasher.ocja.game;
 
import java.util.Random;

/**
 * @author Thomas Mcsherry,Mubasher Mohammede
 *
 */
public class Robot  {
	private String model;
	private double power ;
	boolean isAlive = true;

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Robot(String model) {
		super();
		this.model = model;
		
		Random ran = new Random();
		power = ran.nextInt(101);
		
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}

}
