package com.ajscanlan.robotsvshumans;

public class Human extends Lifeform{
	private String name;
	static int gamesWon, gamesLost, gamesDrew;
	final static int DRAW = 0, LOSS = 1, WIN = 2;
	
	
	public Human(String name, int power, int uuid){
		super(power, uuid);
		this.name = name;
	}

	public String getName() {
		return name;
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
		return "Name: " + this.getName() + ", Power: " + this.getPower();
	}
}
