package week3Project;

public class Navigation {
	
	String mode;

	
	public Navigation(String mode) {
		this.mode = mode;

	}
	
	public String on() {
		return "Navigation system is on";
	}
	
	public String off() {
		return "Navigation system is off";
	}
	
	public void setSensors() {
		this.mode = "Passive";

	}

}
