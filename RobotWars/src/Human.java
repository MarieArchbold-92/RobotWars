

public class Human extends Lifeform {
	
	public static int totalPower = 0;

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
	
	public int getPower(){
		return super.getPower();
	}
	
}
