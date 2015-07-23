import java.util.Random;

/**
 * @author Craig McGarry
 *
 */
public class Humans {


	String[] Humans = new String[]{"Foot Soldier","Elite Soldier","Human Artillery","Bombers "};
	String humanType;
	static Random AttackValue = new Random();
	int randValue = AttackValue.nextInt(100);


	public Humans(){
		this.humanType = Humans[AttackValue.nextInt(Humans.length)];
	}

	public String getHumanType() {
		return humanType;
	}

	public int getRandValue() {
		//int randValue = AttackValue.nextInt(100);
		return randValue;
	}
	public void setRandValue(int randValue) {

		this.randValue = randValue;
	}
	public String toString(){
		return "human type " +  getHumanType();
	}

}

