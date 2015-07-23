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
	public void setPower(int power) {
		this.power = power;
	}

	protected int life = 100;

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
	
	public int getLife(){
		return this.life;
	}
	
	public void setLife(int life){
		this.life = life;
	}
}
