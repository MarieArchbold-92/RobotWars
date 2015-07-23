package com.conorbrennan.robotsVhumans;

import java.util.Random;
import java.util.Scanner;

public class GameApp {
	Random rand = new Random();
	Human[] humanArmy = new Human[500];
	Robot[] robotArmy = new Robot[500];
	int robotAType = 0;
	int robotBType = 0;
	int humanPower ;
	int robotPower ;

	String robotType ;
	int humanID = 0;

	public static void main(String[] args) {
		GameApp g = new GameApp();
		g.populateArray();
		g.runProgram();

	}
	public void runProgram(){
		boolean quit = false;
		do{

			Scanner scan = new Scanner(System.in);
			String oldChoice ;
			int choice;
			try {
				System.out.println("---Game menu---\n1) standard battle\n2) last man/robot standing\n3) quit");
				oldChoice = scan.nextLine();
				choice = Integer.parseInt(oldChoice);
				if(choice==1){
					runStandardGame();

				}else if(choice ==2){
					runLastManRobotGame();

				}else if(choice == 3){
					System.out.println("Thank you for playing .... Good bye");
					quit = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid optiob from the menu (1-3)");
			}


		}while(quit==false);

	}	
	private void populateArray(){
		for(int i = 0; i<robotArmy.length;i++){
			humanPower = (rand.nextInt(101));
			robotPower = (rand.nextInt(101));

			int robotChoice = rand.nextInt(2);
			if(robotChoice==1){
				robotType="Type B";
				robotBType++;
			}else{
				robotType="Type A";
				robotAType++;
			}
			//			System.out.println(humanPower+" "+robotPower);
			Human c = new Human("john connor",humanID , humanPower);
			Robot r = new Robot(robotType,robotPower);
			robotArmy[i]=r;
			humanArmy[i]=c;
			humanID++;
		}
	}
	private void runLastManRobotGame() {
		// TODO Auto-generated method stub
		populateArray();
		int humanWin = 0;
		int robotWin = 0;
		Lifeform champion = null ;

		int humanCount = 0;
		int robotCount = 0;
		for(int i =0  ;humanWin<robotArmy.length&&robotWin<robotArmy.length;i++ ){
			System.out.println(humanArmy[humanCount].power+" "+robotArmy[robotCount].power+" "+humanCount);
			if(humanArmy[humanCount].power>robotArmy[robotCount].power){
				champion = humanArmy[humanCount];
				humanArmy[humanCount].power = (humanArmy[humanCount].power * 90)/100 ; 
				robotCount++;
				humanWin++;
			}else if(humanArmy[humanCount].power<robotArmy[robotCount].power){
				champion = robotArmy[robotCount];
				robotArmy[robotCount].power = (robotArmy[robotCount].power * 90)/100 ; 
				humanCount++;
				robotWin++;
			}else{
				champion = null ;
				humanCount++;
				robotCount++;
				humanWin++;
				robotWin++;
			}
		}	
		if(robotWin > humanWin ){
			System.out.println("The last one standing was a robot !! The champion was "+champion);
		}else if(humanWin > robotWin){
			System.out.println("The last one standing was a human !! The champion was "+champion);
		}else {
			System.out.println("There is no one left standing !! Draw!!");
		}
	}
	private void runStandardGame(){

		int humanWins = 0;
		int humanLosses = 0;
		int draws = 0;
		int robotWins = 0;
		int robotLosses = 0;
		int robotAType = 0;
		int robotBType = 0;




		for(int i = 0 ; i < humanArmy.length ; ++i){
			int robotChoice = rand.nextInt(2);
			if(robotChoice==1){
				robotType="Type B";
				robotBType++;
			}else{
				robotType="Type A";
				robotAType++;
			}


			humanID++;
			//System.out.print(robotArmy[i].modelName+" "+robotArmy[i].power);
			//System.out.print(humanArmy[i].name+humanArmy[i].humanID+" "+humanArmy[i].power);
			if(humanArmy[i].getPower()>robotArmy[i].getPower()){
				humanWins++;
				robotLosses++;
				//System.out.println(humanPower +" "+robotPower );
				//System.out.println("Human wins = " + humanWins );

			}else if(humanArmy[i].getPower()==robotArmy[i].getPower()){
				draws++;
				//System.out.println(humanPower +" "+robotPower );
				//System.out.println("draws  = " + (humanDraws+robotDraws) );
			}else{
				robotWins++;
				humanLosses++;
				//System.out.println(humanPower +" "+robotPower );
				//System.out.println("robot wins  = " + robotWins );
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
		System.out.println("There were "+robotAType+" robots of type A\nThere were "+robotBType+" robots of type B");
	}

}
