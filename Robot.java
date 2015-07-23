package com.mubasher.ocja.game;
 
import java.util.Random;

/**
 * @author Thomas , Mubasher
 *
 */
public class Robot  {
	private String model;
	private int power ;

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
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}

}
