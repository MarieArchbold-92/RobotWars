package robots.v.humans;

public class GameApp {

	public static void main(String[] args) {	
		GameApp newGame = new GameApp();
		newGame.runProgram();
		
	}
	public void runProgram(){
		int robotWinCount = 0;
		int humanWinCount = 0;
		int totalHumanPower = 0;
		int totalRobotPower = 0;
		int totalDraws = 0;


		Robot[] robotArray = new Robot[1000];
		Human[] humanArray = new Human[1000];

		for(int i = 0; i < 1000; ++i){
			robotArray[i] = new Robot();
			humanArray[i] = new Human();
		}

		for(int i = 0; i < 1000; ++i){
			if(humanArray[i].getPowerLevel() > robotArray[i].getPowerLevel()){
				humanWinCount++;
				totalHumanPower = totalHumanPower + humanArray[i].getPowerLevel();
			}else if(humanArray[i].getPowerLevel() == robotArray[i].getPowerLevel()){
				totalDraws++;
			}else{
				robotWinCount++;
				totalRobotPower = totalRobotPower + robotArray[i].getPowerLevel();
			}

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
}
