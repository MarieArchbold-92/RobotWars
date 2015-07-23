package robots.v.humans;

import java.util.Random;

public class Lifeform {
	private int powerLevel;
	static int idNumCounter;
	private int idNumber = idNumCounter;
	private boolean isAlive = true;

	public int getIdNumber() {
		return idNumber;
	}
	public int getPowerLevel() {
		return powerLevel;
	}
	private void setPowerLevel() {
		Random rand = new Random();
		this.powerLevel=rand.nextInt(101);
	}
	Lifeform(){
		++idNumCounter;
		this.setPowerLevel();
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void kill() {
		this.isAlive = false;
	}
}


