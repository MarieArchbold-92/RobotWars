

public class Robot extends Lifeform{
	private String modelName;
	private RobotWeapon rw = RobotWeapon.CLAWS;
	
	public static float totalPower = 0;
	/** 
	 * @param modelName String
	 * @param ID String
	 * @param power	int
	 */
	public Robot(String modelName, String ID, int power){
		super(ID, power);
		this.modelName = modelName;
		totalPower += power;
	}
	
	
	public String getModelName(){
		return this.modelName;
	}
	
	
	public String toString(){
		return this.getModelName() + " " + super.toString();
	}
	
	//gets weapon power * (robots power / 100)
	public float getWeaponPower(){
		return this.rw.getPower() * (this.getPower() / 100f);
	}
	
	public void setWeapon(RobotWeapon rw){
		this.rw = rw;
	}
	
	public String toWeaponString(){
		return this.getID() + " with " + this.rw.getName(); 
	}
}
