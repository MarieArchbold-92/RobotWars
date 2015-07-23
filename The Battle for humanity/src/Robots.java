/**
 * 
 */

/**
 * @author Marie Archbold
 *
 */
import java.util.Random;

public class Robots {
	String[]modelName = new String[]{"Droid", "Walker"};
	String robotType;
	static Random powerValue = new Random();
	int RandValue = powerValue.nextInt(100);
	
	public Robots(){
		this.robotType = modelName[powerValue.nextInt(2)];
	}

	
	public String getRobotType() {
		return robotType;
	}

	public int getRandValue() {
		//int robotRandValue = powerValue.nextInt(100);
		return RandValue;
	}


	public void setRandValue(int randValue) {
		RandValue = randValue;
	}
	public String toString(){
		return "Robot type " +  getRobotType();
	}

}
