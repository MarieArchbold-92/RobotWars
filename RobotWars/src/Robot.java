

public class Robot extends Lifeform{
	private String modelName;
	
	public static int totalPower = 0;
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
}
