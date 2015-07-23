package com.ajscanlan.robotsvshumans;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameApp {

	ArrayList<Lifeform> robots = new ArrayList<Lifeform>();
	ArrayList<Lifeform> humans = new ArrayList<Lifeform>();
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<String> roboNames = new ArrayList<String>();
	
	final int LIMIT = 1000;
	private int totalHumanPower, totalRobotPower;
	
	public static void main(String[] args) {
		GameApp gl = new GameApp();
		gl.populateLists();
		gl.runProgram();
		gl.displayResults();
	}

	private void displayResults() {
		System.out.println("Humans\n-----------");
		System.out.println("Games won: " + Human.getGamesWon());
		System.out.println("Games lost: " + Human.getGamesLost());
		System.out.println("Games drew: " + Human.getGamesDrew() + "\n\n");
		
		System.out.println("Robots\n-----------");
		System.out.println("Games won: " + Robot.getGamesWon());
		System.out.println("Games lost: " + Robot.getGamesLost());
		System.out.println("Games drew: " + Robot.getGamesDrew() + "\n\n");

		if(Human.getGamesWon() > Robot.gamesWon){
			System.out.println("HUMANS WIN, IT'S A FINE DAY FOR HUMANITY");
		} else if(Human.getGamesWon() == Robot.getGamesWon()){
			System.out.println("It was a draw, EVERYONE IS A LOSER");
		} else {
			System.out.println("ROBOTS WIN, ALL HAIL OUR ROBOT OVERLORDS");
		}
		
		System.out.println("Total Human power: " + totalHumanPower);
		System.out.println("Total Robot power: " + totalRobotPower);

	}

	private void populateLists() {
		Random randy = new Random();
		
		try {
			Scanner h = new Scanner(new File("names.txt"));
			Scanner r = new Scanner(new File("robots.txt"));
			
			while (h.hasNext()){
			    names.add(h.next());
			}
			
			while(r.hasNext()){
				roboNames.add(r.next());
			}
			r.close();
			h.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < LIMIT/2; ++i){
			humans.add(new Human(names.get(randy.nextInt(names.size())), randy.nextInt(101), i));
			robots.add(new Robot(roboNames.get(randy.nextInt(roboNames.size())) + " " + Robot.getModelType(), randy.nextInt(101), i + 500));
		}
		
		
		
	}

	private void runProgram() {
		
		for(int i = 0; i < LIMIT/2; ++i){
			int roboPower = robots.get(i).getPower();
			int humanPower = humans.get(i).getPower();
			
			System.out.println(humans.get(i) +" vs " + robots.get(i) + "\n");
			
			totalHumanPower += humanPower;
			totalRobotPower += roboPower;
			
			if(humanPower == roboPower){
				Human.incGames(Human.DRAW);
				Robot.incGames(Robot.DRAW);
			}else if(humanPower > roboPower){
				Human.incGames(Human.WIN);
				Robot.incGames(Robot.LOSS);
			}else {
				Human.incGames(Human.LOSS);
				Robot.incGames(Robot.WIN);
			}
		}
		
	}

}
