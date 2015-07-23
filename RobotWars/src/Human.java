

public class Human extends Lifeform {
	
	private HumanWeapon hw = HumanWeapon.PITCHFORK;
	public static float totalPower = 0f;

	public Human(){
		super(("Agent Smith" + (-1)), -1);
	}
	
	public Human(int name, int power){
		super(("Agent Smith" + name), power);
		totalPower += power;
	}
	
	public Human(String name, int power){
		super(name, power);
		totalPower += power;
	}
	
	public float getPower(){
		return super.getPower();
	}
	
	//gets weapon power * (robots power / 100)
	public float getWeaponPower(){
		return this.hw.getPower() * (this.getPower() / 100f);
	}
	
	public void setWeapon(HumanWeapon hw){
		this.hw = hw;
	}
	
	public String toWeaponString(){
		return this.getID() + " with " + this.hw.getName(); 
	}
}
