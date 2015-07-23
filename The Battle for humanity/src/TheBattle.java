import java.util.Random;
import java.util.Scanner;

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
	private float deBuff = -0.5F;




	public static void main(String[] args) {

		new TheBattle().theBattle();



	}
	private void theBattle(){

		for(int i = 0; i< humanArray.length; i++ ){
			humanArray[i]= new Humans();
			System.out.println(i+1 +" " + humanArray[i].toString()+"\n"+ "Human attack dammage " + humanArray[i].getRandValue()+ "\n");
		}
		for(int i = 0; i< robotArray.length; i++ ){
			robotArray[i]= new Robots();
			System.out.println(i+1 +" " + robotArray[i].toString()+"\n"+ "Robot attack dammage: " + robotArray[i].getRandValue()+"\n");

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
				humanWins--;
				robotLoss--;
				robotWins--;
				humanLoss--;
			}

		}
		System.out.println("Human wins = "+ humanWins+ "\n"
				+ "Robot Wins =  " + robotWins + "\n"
				+ "Human losses = " + humanLoss + "\n"
				+ "Robot losses = " + robotLoss + "\n"
				+ "Total Draws = " + draw);
		if(robotWins > humanWins){
			System.out.println("Robots won\n\n\n");

		}else if(humanWins > robotWins){
			System.out.println("Humans won\n\n\n");

		}
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you want to play a different game mode\n"
				+ "Y means yes\n"
				+ "N means no");
		String choice =scan.nextLine().toUpperCase();

		if(choice == "y"){
			System.out.println(choice +"Welcome to last man standing mode");
		}else if(choice == "n"){
			System.out.println("Good Bye");

		}

	}

}



