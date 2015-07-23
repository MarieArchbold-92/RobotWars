import java.util.Random;

/**
 * A program that has 1000 Humans fight against robots
 */

/**
 * @author Craig McGarry & Marie Archbold
 *
 */
public class TheBattle {

	private int humanWins = 0;
	private int robotWins = 0;
	private int humanLoss = 0;
	private int robotLoss = 0;
	private int draw = 0;
	private Humans[] humanArray = new Humans[500];
	private Robots[] robotArray = new Robots[500];


	public static void main(String[] args) {
		// possible humans randomly chosen

		//		TheBattle TheHumans = new TheBattle();
		//		String[] Humans = new String[]{"Foot Soldier","Elite Soldier","Human Artillery","Bombers "};
		//		Random HumanRand = new Random();
		new TheBattle().theBattle();
		

	}
	private void theBattle(){
		
		for(int i = 0; i< humanArray.length; i++ ){
			humanArray[i]= new Humans();
			System.out.println(i +" " + humanArray[i].toString()+ " " + humanArray[i].getRandValue());
		}
		for(int i = 0; i< robotArray.length; i++ ){
			robotArray[i]= new Robots();
			System.out.println(i +" " + robotArray[i].toString()+ " " + robotArray[i].getRandValue());

		}
		for(int i =0; i < robotArray.length;i++ ){
			if(robotArray[i].getRandValue() < humanArray[i].getRandValue()){
				humanWins++;
				robotLoss++;
				
			}
			else if(robotArray[i].getRandValue() > humanArray[i].getRandValue()){
				robotWins++;
				humanLoss++;
			}
			else{
				draw++;
			}
			
		}
		System.out.println("Human wins = "+ humanWins+ "\n"
				+ "Robot Wins =  " + robotWins + "\n"
				+ "Human losses = " + humanLoss + "\n"
				+ "Robot losses = " + robotLoss + "\n"
				+ "Total Draws = " + draw);
		if(robotWins > humanWins){
			System.out.println("Robots won");
				
		}else if(humanWins > robotWins){
			System.out.println("Humans won");
			
		}
		
	}
	
}



