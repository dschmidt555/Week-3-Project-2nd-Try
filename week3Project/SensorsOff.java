package week3Project;

public class SensorsOff implements Command{

	Sensors sensors;
	
	public SensorsOff(Sensors sensors) {
		this.sensors=sensors;
	}
	
	public void execute() {
		sensors.off();
	}
	
	public void undo() {
		sensors.on();
	}
	
}
