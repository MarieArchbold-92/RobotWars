/**
 * 
 */
package com.mubasher.ocja.game;

import java.util.Scanner;

/**
 * @author Mubasher Mohammede
 *
 */
public class GameApp {
	Human[] human = new Human[1000];
	Robot[] robot = new Robot[1000];
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
		int userChoice =0;
		do{
		intArray();
	//	System.out.println(human[i].getName()+"("+ human[i]);
		System.out.println("!!!!Welocme to GameApp !!!!!");
		System.out.println("\n1) please enter one to play Game");
		System.out.println("2) please enter 2 to quit");
		Scanner scan = new Scanner(System.in);
		 userChoice = scan.nextInt();
		System.out.println("you choose option "+ userChoice);
		if(userChoice==2){
			System.out.println("you choose to quit");
			break;
			
		}
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
		}while (userChoice!=2);		
	}
	public void intArray(){
		for(int i =0 ; i< human.length; i++){
			human[i] = new Human("bob"+i);
			if(i % 2 ==0 ){
				robot[i] = new Robot ("Type A"+ i);
			}else 
				robot[i] = new Robot ("Type B"+ i);
		}
	}

}
