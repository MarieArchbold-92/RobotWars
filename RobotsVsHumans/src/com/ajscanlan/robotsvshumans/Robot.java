package com.ajscanlan.robotsvshumans;

import java.util.Random;

public class Robot extends Lifeform {
	private String model;
	static int gamesWon, gamesLost, gamesDrew;
	static final int DRAW = 0, LOSS = 1, WIN = 2;
	
	public Robot(String model, int power, int uuid){
		super(power, uuid);
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	
	public static String getModelType() {
		Random randy = new Random();
		int rand = randy.nextInt(2);
		
		if(rand == 0){
			return "Model A";
		} else {
			return "Model B";
		}
	}
	
	public static int getGamesWon() {
		return gamesWon;
	}

	public static int getGamesLost() {
		return gamesLost;
	}

	public static int getGamesDrew() {
		return gamesDrew;
	}
	
	public static void incGames(int type){
		switch(type){
		case 0:
			gamesDrew++;
			break;
		case 1:
			gamesLost++;
			break;
		case 2:
			gamesWon++;
			break;
		default:
			System.out.println("Something went horribly wrong");
		}
	}
	
	public String toString(){
		return "Name: " + this.getModel() + ", Power: " + this.getPower();
	}

}

