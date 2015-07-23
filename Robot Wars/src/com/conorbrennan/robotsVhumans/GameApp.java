package com.conorbrennan.robotsVhumans;

import java.util.Random;

public class GameApp {

	public static void main(String[] args) {
		GameApp g = new GameApp();
		g.runProgram();

	}
	public  void runProgram(){
		Random rand = new Random();
		int humanWins = 0;
		int humanLosses = 0;
		int draws = 0;
		int robotWins = 0;
		int robotLosses = 0;
		String robotType ;
		

		int humanID = 0;
		Human[] humanArmy = new Human[500];
		Robot[] robotArmy = new Robot[500];


		for(int i = 0 ; i < humanArmy.length ; ++i){
			int robotChoice = rand.nextInt(2);
			if(robotChoice==1){
				robotType="Type B";
			}else{
				robotType="Type A";
			}
			int humanPower = (rand.nextInt(100)+1);
			int robotPower = (rand.nextInt(100)+1);
			Human c = new Human("john connor",humanID , humanPower);
			Robot r = new Robot(robotType,robotPower);
			robotArmy[i]=r;
			humanArmy[i]=c;
			humanID++;
//			System.out.print(robotArmy[i].modelName+" "+robotArmy[i].power);
//			System.out.print(humanArmy[i].name+humanArmy[i].humanID+" "+humanArmy[i].power);
			if(humanPower>robotPower){
				humanWins++;
				robotLosses++;
//				System.out.println(humanPower +" "+robotPower );
//				System.out.println("Human wins = " + humanWins );

			}else if(humanPower==robotPower){
				draws++;
//				System.out.println(humanPower +" "+robotPower );
//				System.out.println("draws  = " + (humanDraws+robotDraws) );
			}else{
				robotWins++;
				humanLosses++;
//				System.out.println(humanPower +" "+robotPower );
//				System.out.println("robot wins  = " + robotWins );
			}
		}
		if(robotWins>humanWins){
			System.out.println("Robots have won the war\nThe score was: \t"+robotWins+" robot victories to "+humanWins+" human victories" );
		}else if(humanWins>robotWins){
			System.out.println("Humans have won the war\nThe score was: \t"+humanWins+" human victories to "+robotWins+" robot victories" );
		}else{
			System.out.println("The war resulted in a draw!!"+ "draws: "+draws);
		}
		System.out.println("Human wins: "+humanWins+" Robot wins: "+robotWins);
		System.out.println("Human losses: "+humanLosses+" Robot losses: "+robotLosses);
		System.out.println("Draws: "+draws);
		for(int i = 0;i<robotArmy.length;++i){
			
		}
		
	}	

}
