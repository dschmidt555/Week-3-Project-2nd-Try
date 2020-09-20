package week3Project;

public class Sensors {
	
	String mode;
	int powerLevel;
	
	public Sensors(String mode, int powerLevel) {
		this.mode = mode;
		this.powerLevel = powerLevel;
	}
	
	public String on() {
		String powerStr = String.valueOf(powerLevel);
		return "Sensors on in " + mode+" mode at power " + powerStr;
	}
	
	public String off() {
		return "Sensors Off";
	}
	
	public void setSensors() {
		this.mode = "Passive";
		this.powerLevel = 5;
		System.out.println("Mode is "+mode+", power level is "+powerLevel);
	}

}
