package com.kevinphair.robotwars;

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

	}

	public void runProgram() {
		
		Contestant[] robotArmy = initialiseArmy();
		Contestant[] humanArmy = initialiseArmy();
	}
	
	public Contestant[] initialiseArmy() {
		
	}
	
	public int doBattle(Contestant[] vs1, Contestant[] vs2) {
		for (int i = 0; i < vs1.length; ++i) {
			int result = fight(vs1[i], vs2[i]);
			// vs1 loses (vs2 wins)
			if (result < 0) {
				
			// vs1 wins (vs2 loses)
			} else if (result > 0) {
				
			// vs1 draws (vs2 draws)
			} else {
				
			}
		}
	}
	
	public int fight(Contestant vs1, Contestant vs2) {
		
	}
	
}
