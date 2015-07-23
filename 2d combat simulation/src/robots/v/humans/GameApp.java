package robots.v.humans;

import java.util.ArrayList;
import java.util.Scanner;

public class GameApp {

	int robotWinCount = 0;
	int humanWinCount = 0;
	int totalHumanPower = 0;
	int totalRobotPower = 0;
	int totalDraws = 0;

	ArrayList robotArray = new ArrayList();
	ArrayList humanArray = new ArrayList();

	public static void main(String[] args) {	
		GameApp newGame = new GameApp();
		newGame.runProgram();

	}
	public void runProgram(){
		Scanner scan = new Scanner(System.in);

		combatantInit();		

		System.out.println("======== Welcome to Robo Wars Combat Simulation 2015 ========" +
				"\n" + "--------------------------------------------------------------" +
				"\n" + "Please pick your game mode:" +
				"\n" + "1.Skrimish" +
				"\n" + "2.Last team standing" + "\n");
		
		int gameChoice = scan.nextInt();
		
		switch(gameChoice){
		case 1: skrimish(); break;
		case 2: 
		}

	}

	public void skrimish(){
		for(int i = 0; i < 1000; ++i){
			fightMethod(i, i);

			System.out.println("Round" + (i + 1));
			System.out.println(humanArray[i].getName() + " has a power of " + humanArray[i].getPowerLevel());
			System.out.println(robotArray[i].getModelName() + " has a power of " + robotArray[i].getPowerLevel() + "\n");
		}
		if(robotWinCount > humanWinCount){
			System.out.println("Robots won with total power of: " + totalRobotPower
					+ "\n Total Robot wins: " + robotWinCount
					+ "\n Total Human wins: " + humanWinCount
					+ "\n Total draws: " + totalDraws);
		}else if(robotWinCount == humanWinCount){
			System.out.println("Draw!");
		}else{
			System.out.println("Humans won with total power of: " + totalHumanPower
					+ "\n Total Human wins: " + humanWinCount
					+ "\n Total Robot wins: " + robotWinCount
					+ "\n Total draws: " + totalDraws);
		}
	}
	public void combatantInit(){
		for(int i = 0; i < 1000; ++i){
			robotArray.add(new Robot());
			humanArray.add(new Human());
		}
	}
	public void fightMethod(int humanFighter, int robotFighter){
		if(humanArray(humanFighter).getPowerLevel() > robotArray[robotFighter].getPowerLevel()){
			humanWinCount++;
			totalHumanPower = totalHumanPower + humanArray[humanFighter].getPowerLevel();
		}else if(humanArray[humanFighter].getPowerLevel() == robotArray[robotFighter].getPowerLevel()){
			totalDraws++;
		}else{
			robotWinCount++;
			totalRobotPower = totalRobotPower + robotArray[robotFighter].getPowerLevel();
		}
	}
}
