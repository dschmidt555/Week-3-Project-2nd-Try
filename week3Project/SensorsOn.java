package week3Project;

public class SensorsOn implements Command {
	
	Sensors sensors;
	
	public SensorsOn(Sensors sensors) {
		this.sensors=sensors;
	}
	
	public void execute() {
		sensors.on();
		sensors.setSensors();;
	}
	
	public void undo() {
		sensors.off();
	}

}
