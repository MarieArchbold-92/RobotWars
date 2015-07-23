package com.mubasher.ocja.game;
@author Thomas Mcsherry,Mubasher Mohammede

import java.util.Random;

public class Human {
	private String name;
	private int power;

	public Human(String name) {
		super();
		this.name = name;
		
		Random ran = new Random();
		power = ran.nextInt(101);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	

}
