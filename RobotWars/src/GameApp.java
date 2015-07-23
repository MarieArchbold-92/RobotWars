

import java.util.Random;

public class GameApp {

	public static void main(String[] args) {
//		Robot r = new Robot("A", "Type B", 10);
//		System.out.println(r.getPower() + " " + r.getID());
		
		//Human h = new Human(100, 50);
		//System.out.println(h.getPower() + h.getID());
		
		GameApp ga = new GameApp();
		ga.runProgram();
	}
	
	
	private void runProgram(){
		int humanWins = 0;
		int robotWins = 0;
		int draws = 0;
		
		Human[] humans = new Human[500];
		Robot[] robots = new Robot[500];
		
		Random rand = new Random();
		
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
		
		
		//TEST PRINTOUT
//		for(Human h : humans){
//			System.out.println(h.toString());
//		}
//		
//		for(Robot r : robots){
//			System.out.println(r.toString());
//		}
		
		
		//BATTLE!!
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
		
		System.out.println("Humans won " + humanWins + " times");
		System.out.println("Robots won " + robotWins + " times");
		System.out.println("Humans and Robots drew " + draws + " times");
		
		System.out.println("Total human power was " + Human.totalPower);
		System.out.println("Total robot power was " + Robot.totalPower);
		
		System.out.println("The winners by total power are " + (Human.totalPower > Robot.totalPower ? "humans" : "robots")  );
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
