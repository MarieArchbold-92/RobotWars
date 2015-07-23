/**
 * 
 */
package com.mubasher.ocja.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author @author Thomas Mcsherry,Mubasher Mohammede
 *
 */
public class GameApp {
	Human[] human = new Human[1000];
	Robot[] robot = new Robot[1000];
	ArrayList<String> list = new ArrayList<String>();
	int humanWins =0 ;
	int draws= 0;
	int robotWins =0;
	int robotTotalPower =0;
	int humanTotalPower=0;

	public static void main(String[] args) {

		GameApp game = new GameApp();
		game.runProgram();

	}

	public void runProgram(){
		genrateRandomName();
		int userChoice =0;
		do{
			intArray();
			//	System.out.println(human[i].getName()+"("+ human[i]);
			System.out.println("!!!!Welocme to GameApp !!!!!");
			System.out.println("\n1) please choose single battle mode");
			System.out.println("2) Please choose Extintion battle mode ");
			System.out.println("3) Quit ");


			Scanner scan = new Scanner(System.in);
			userChoice = scan.nextInt();
			System.out.println("you choose option "+ userChoice);
			if(userChoice==1){
				singleBattleMode();

			}else if(userChoice==2){
				extintionBattleMod();
			}else if(userChoice==3){
				System.out.println("Good bye");
				break;

			}else {
				System.out.println("invlaid option");

			}



		}while (userChoice!=3);	


	}
	public void extintionBattleMod(){
		intArray();
		for(int i = 0; i <human.length; i++){
			for(int j =0; j< robot.length;j++){
				if(robot[j].isAlive){
					System.out.println(human[i].getName()+"("+ human[i].getPower()+") vs"+ robot[j].getModel()+"("+robot[j].getPower()+")");
					if(human[i].getPower()> robot[j].getPower()){
						robot[j].setAlive(false);
						human[i].setPower(human[i].getPower()-(human[i].getPower()/200D));
						System.out.println(human[i].getName()+" Wins");

					}else if(robot[j].getPower() > human[i].getPower()){
						human[i].setAlive(false);
						robot[j].setPower(robot[j].getPower()-(robot[j].getPower()/200D));
						System.out.println(robot[j].getModel()+" Wins");
						break;
					}else{
						human[i].setAlive(false);
						robot[j].setAlive(false);
						break;
					}
				}
			}

		}
		int humanAlive = 0;
		int robotAlive =0;
		for(int i =0; i< human.length;i++){
			if((human[i]).isAlive()){
				humanAlive++;
			}
			if(robot[i].isAlive()){
				robotAlive++;
			}
		}
		System.out.println(robotAlive);
		System.out.println(humanAlive);

		if(humanAlive ==0){
			System.out.println("Robot win with "+ robotAlive +" surviors");
		}else {
			System.out.println("Human win with  "+ humanAlive + " surviours ");
		}
	}
	public void singleBattleMode(){

		for(int i = 0 ; i < human.length ; i++){
			robotTotalPower += robot[i].getPower();
			humanTotalPower += human[i].getPower();

			System.out.println(human[i].getName()+"("+ human[i].getPower()+") vs"+ robot[i].getModel()+"("+robot[i].getPower()+")");
			if(human[i].getPower() > robot[i].getPower()){
				humanWins++;
				System.out.println(human[i].getName()+"Wins");
			}else if(robot[i].getPower()> human[i].getPower())
			{
				robotWins++;
				System.out.println(robot[i].getModel()+"Wins");
			}else {
				draws++;
				System.out.println("Draw");
			}


		}
		System.out.println("Human Wins: "+ humanWins + ", Draws: " + draws 
				+ ",Loses: " + (human.length - draws - humanWins));
		System.out.println("\nRobot Wins: "+ robotWins + ", Draws: " + draws 
				+ ",Loses: " + (robot.length - draws - robotWins));
		if(robotWins> humanWins){
			System.out.println("\nRobot is the Winner ");
		}else if(humanWins> robotWins){
			System.out.println("\nHumans is the Winner!!!!!!!");
		}else {
			System.out.println("Its a Draw we have no winner");
		}
		System.out.println("Robot Total Power is: "+ robotTotalPower +" And Human Total Power is: "+ humanTotalPower);

	}
	public void intArray(){
		for(int i =0 ; i< human.length; i++){

			human[i] = new Human(this.list.get(i));
			if(i % 2 ==0 ){
				robot[i] = new Robot ("Type A"+ i);
			}else 
				robot[i] = new Robot ("Type B"+ i);
		}
	}
	public void genrateRandomName(){
		try {
			Scanner s = new Scanner(new File("RandomNames.txt"));
			while (s.hasNext()){
				list.add(s.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	

}
