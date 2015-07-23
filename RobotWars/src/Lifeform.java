/**
 * Definition: 
 * 
 * @author Artjoms Porss
 * Version No: 1.0
 * 
 */


/**
 *
 */
public class Lifeform {
	protected String ID;
	protected int power;

	public Lifeform(String ID, int power) {
		this.ID = ID;
		this.power = power;
	}

	public String getID() {
		return this.ID;
	}

	public int getPower() {
		return this.power;
	}
	
	public String toString(){
		return this.getID() + "'s power is " + this.getPower();
	}
}
