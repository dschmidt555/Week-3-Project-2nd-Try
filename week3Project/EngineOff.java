package week3Project;

public class EngineOff implements Command{
	
Engine engine;
	
	public EngineOff(Engine engine) {
		this.engine=engine;
	}
	
	public void execute() {
		engine.off();
	}
	
	public void undo() {
		engine.on();
	}

}
