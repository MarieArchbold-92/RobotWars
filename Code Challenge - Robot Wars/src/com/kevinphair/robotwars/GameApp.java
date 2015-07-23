package com.kevinphair.robotwars;

import java.util.Random;

/**
 * @author Kevin Phair, Sam Downes
 * Created 23 Jul 2015
 *
 * Code Challenge - "Robot Wars"
 * 
 * Initial spec:
 * Create 1,000 robots and 1,000 humans with unique model numbers (robots) and
 * unique names (humans). Each has a random power value from 0 to 100 inclusive.
 * One of each should do battle against each other and after 1,000 battles the
 * wins, draws and losses should be tallied up to determine the winner. 
 *
 * 9:00 - Start project
 *	Design program and set up variables
 * 9:10
 *  Create classes
 *  - Contestant - Contains power value (int) and ID (String)
 *  - ScoreBoard - Contains wins, losses and draws for each army
 *  
 *  Create variable
 *  - humanArmy[] = Contestant[1000]
 *  - robotArmy[] = Contestant[1000]
 *    
 *  Create method placeholders
 *  - Contestant[] initialiseArmy() - Create and return the army array 
 *  - int doBattle (Contestant vs1, Contestant vs2)
 *    >	Iterate over army objects applying fight() to each opposing pair
 *    > Update the ScoreBoard object accordingly
 *  - int fight (Contestant vs1, Contestant vs2) - Give the result of fight between two Contestants
 *  
 *  
 * 9:30 - Break
 * 9:45 - Write code for initialiseArmy()
 * 9:50 - Write code for fight()
 * 9:55 - Write code for doBAttle()
 * 10:00 - Test
 * 11:00 - Break
 * 
 * 12:00 - Finished and Demo
 *
 */
public class GameApp {

	ScoreBoard sb;
	
	public static void main(String[] args) {

		new GameApp().runProgram();
		
	
	}

	public void runProgram() {
		
		sb = new ScoreBoard(2);
		
		Contestant[] robotArmy = initialiseArmy();
		Contestant[] humanArmy = initialiseArmy();
		int result = doBattle(robotArmy, humanArmy);
		System.out.println(result);
		if(result < 0){
			System.out.println("The robot army looses");
			
		}else if(result > 0){
			System.out.println("The robot army wins");
			
		}else{
			System.out.println("The armies have drawn");
		}
			
	}
	
	/**
	 * 
	 * @return
	 */
	
	public Contestant[] initialiseArmy() {
		
		Contestant [] army = new Contestant[500];
		for(int i = 0; i < army.length; ++i){
			army[i] = new Contestant(new Random().nextInt(101),"" + i);
		}
		return army;
		
	}
	
	/**
	 * 
	 * @param vs1
	 * @param vs2
	 * @return
	 */
	
	public int doBattle(Contestant[] vs1, Contestant[] vs2) {
		for (int i = 0; i < vs1.length; ++i) {
			int result = fight(vs1[i], vs2[i]);
			// vs1 loses (vs2 wins)
			if (result < 0) {
				sb.addWin(1);
				sb.addLoss(0);
				
			// vs1 wins (vs2 loses)
			} else if (result > 0) {
				sb.addWin(0);
				sb.addLoss(1);
				
			// vs1 draws (vs2 draws)
			} else {
				sb.addDraw(0);
				sb.addDraw(1);
				
			}
			System.out.println(sb.getWins(0) + " - " + sb.getWins(1));
			
		}
		if(sb.getWins(0) > sb.getWins(1)){
			return 1;
		}else if (sb.getWins(1) > sb.getWins(0)){
			return - 1;
		}else {
			return 0;
		}
	
	}
	
	public int fight(Contestant vs1, Contestant vs2) {
		
		int vs1Power = vs1.getPower();
		int vs2Power = vs2.getPower();
		
		
		if(vs1.getPower() > vs2.getPower()){
			System.out.println(vs1Power + " > " + vs2Power);
			return 1;			
		}else if (vs2.getPower() > vs1.getPower()){
			System.out.println(vs1Power + " < " + vs2Power);
			return -1;
		}else{
			System.out.println(vs1Power + " = " + vs2Power);
			return 0;
		}
	
		
		
		
	}
	
}
