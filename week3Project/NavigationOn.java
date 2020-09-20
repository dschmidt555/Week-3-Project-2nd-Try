package week3Project;

public class NavigationOn implements Command{
	
Navigation navigation;
	
	public NavigationOn(Navigation navigation) {
		this.navigation=navigation;
	}
	
	public void execute() {
		navigation.on();
		navigation.setSensors();;
	}
	
	public void undo() {
		navigation.off();
	}

}
