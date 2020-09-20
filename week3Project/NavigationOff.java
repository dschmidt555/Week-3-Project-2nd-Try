package week3Project;

public class NavigationOff implements Command{
	
Navigation navigation;
	
	public NavigationOff(Navigation navigation) {
		this.navigation=navigation;
	}
	
	public void execute() {
		navigation.off();
	}
	
	public void undo() {
		navigation.on();
	}

}
