package week3Project;

public class EngineOn implements Command{
	
Engine engine;
	
	public EngineOn(Engine engine) {
		this.engine=engine;
	}
	
	public void execute() {
		engine.on();

	}
	
	public void undo() {
		engine.off();
	}

}
