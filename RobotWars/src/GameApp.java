

import java.util.Random;
import java.util.Scanner;

public class GameApp {

	private int humanWins = 0;
	private int robotWins = 0;
	private int draws = 0;

	private Human[] humans = new Human[500];
	private Robot[] robots = new Robot[500];

	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();

	public static void main(String[] args) {
		//		Robot r = new Robot("A", "Type B", 10);
		//		System.out.println(r.getPower() + " " + r.getID());

		//Human h = new Human(100, 50);
		//System.out.println(h.getPower() + h.getID());

		GameApp ga = new GameApp();
		ga.runProgram();
	}


	private void runProgram(){



		//creating robots
		for(int i = 0; i < robots.length; ++i){
			if(i % 2 == 0){
				robots[i] = new Robot("Type A", "R" + (i + 1), rand.nextInt(101));
			}else{
				robots[i] = new Robot("Type B", "R" + (i + 1), rand.nextInt(101));
			}
		}


		//creating humans
		for(int i = 0; i < humans.length; ++i){
			humans[i] = new Human(createName(), rand.nextInt(101));
		}
		boolean fight = true;
		do{
			System.out.println();
			System.out.println("How do you want the lifeforms to do battle?");
			System.out.println("1) Last Man Standing");
			System.out.println("2) Through life");
			System.out.println("3) One on one battles");
			System.out.println("4) Quit");
			System.out.print("Choose an option: ");
			while(!scan.hasNextInt()){
				scan.next();
				System.out.print("Not a number, please enter a number between 1 and 4:");
			}

			int userChoice = scan.nextInt();

			switch(userChoice){
			case 1: 
				lastManStanding();
				break;
			case 2: 
				lifeBattle();
				break;
			case 3: 
				oneOnOneBattle();
				break;
			case 4:
				fight = false;
				System.out.println("Thanks for playing the game, bye!");
				break;
			default: 
				System.out.println("Invalid choice, please pick a number between 1 and 4");
				break;
			}	
		}while(fight);

		//TEST PRINTOUT
		//		for(Human h : humans){
		//			System.out.println(h.toString());
		//		}
		//		
		//		for(Robot r : robots){
		//			System.out.println(r.toString());
		//		}

		/*

		 */


		//LAST MAN STANDING
		//TODO
	}

	private void lifeBattle(){
		//LIFE BATTLE
		boolean inBattle = true;
		int r = 0;
		int h = 0;
		while(inBattle){
			robots[r].setLife(robots[r].getLife() - humans[h].getPower());
			humans[h].setLife(humans[h].getLife() - robots[r].getPower());

			System.out.println(getFightResult(robots[r], humans[h]));

			if(robots[r].getLife() <= 0){
				++r;
			}
			if(humans[h].getLife() <= 0){
				++h;
			}

			if(r >= robots.length || h >= humans.length){
				inBattle = false;
			}
		}

		int humansLeft = 500 - (h + 1);
		int robotsLeft = 500 - (r + 1);
		//print who won
		if(humansLeft > robotsLeft){
			System.out.println("Humans win the battle. " + humansLeft + " survivors.");
		}else{
			System.out.println("Robots win the battle. " + robotsLeft + " survivors");
		}
	}

	private void oneOnOneBattle(){
		//ONE ON ONE POWER BATTLE
		for(int b = 0; b < humans.length; ++b){
			char sign = ' ';
			if(humans[b].getPower() > robots[b].getPower()){
				sign = '>';
				++humanWins;
			}else if(humans[b].getPower() < robots[b].getPower()){
				++robotWins;
				sign= '<';
			}else{
				++draws;
				sign = '=';
			}
			System.out.println(humans[b].toString() + " " + sign + " " + robots[b].toString());
		}

		//print results

		System.out.println("Humans won " + humanWins + " times");
		System.out.println("Robots won " + robotWins + " times");
		System.out.println("Humans and Robots drew " + draws + " times");

		System.out.println("Total human power was " + Human.totalPower);
		System.out.println("Total robot power was " + Robot.totalPower);

		System.out.println("The winners by total power are " + (Human.totalPower > Robot.totalPower ? "humans" : "robots")  );
	}

	private void lastManStanding(){
		boolean inBattle = true;
		int r = 0;
		int h = 0;
		while(inBattle){
			char sign = ' ';
			if(humans[h].getPower() > robots[r].getPower()){
				sign = '>';
				System.out.println(humans[h].toString() + " " + sign + " " + robots[r].toString());
				humans[h].setPower(humans[h].getPower()/2);
				++r;
			}
			else if (robots[r].getPower() > humans[h].getPower()){
				sign= '<';
				System.out.println(humans[h].toString() + " " + sign + " " + robots[r].toString());
				robots[r].setPower(robots[r].getPower()/2);
				++h;
			}
			else{
				sign = '=';
				System.out.println(humans[h].toString() + " " + sign + " " + robots[r].toString());
				++r;
				++h;

			}

			if(r >= robots.length || h >= humans.length){
				inBattle = false;
			}
		}

		int robotSurvivors = 500 - r;
		int humanSurvivors = 500 - h;

		if(r == 500){
			System.out.println("Humans win. " + humanSurvivors + " survivors.");
		}
		else{
			System.out.println("Robots win. "+ robotSurvivors + " survivors.");
		}

	}

	private String getFightResult(Robot robot, Human human) {
		//TODO
		if(robot.getLife() <= 0 && human.getLife() <= 0){
			return robot.toString() + " and " + human.toString() + " died";
		} else if (robot.getLife() <= 0 && human.getLife() > 0){
			return robot.toString() + " died and " + human.toString() + " lives";
		} else if (robot.getLife() > 0 && human.getLife() <= 0){
			return robot.toString() + " lives and " + human.toString() + " died";
		} else {
			//fight again
			return robot.toString() + " and " + human.toString() + " round 2 !";
		}

	}


	//returns a random name of 2 - 7 letters
	private String createName(){
		Random r = new Random();
		char[] name = new char[r.nextInt(6) + 2];
		char[] vowels = new char[]{'a','e','i','o','u'};
		char[] consonant = new char[]{'b','c','d','f','g','h','j'
				,'k','l','m','n','p','q','r','s','t','v','w','x','y','z'};

		for(int l = 0; l < name.length; ++l){
			if(l % 2 == 0){
				name[l] = consonant[r.nextInt(21)];
			}else{
				name[l] = vowels[r.nextInt(5)];
			}
		}

		return new String(name);
	}

}
