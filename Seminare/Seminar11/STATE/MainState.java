package STATE;

public class MainState {

	public static void main(String[] args) {
		Bus bus = new Bus("B289KMI");
		
		bus.goInService();
		bus.arriveAtEndOfLine();
		bus.arriveAtEndOfLine();
		bus.leaveForRoute();
		bus.goInService();

	}

}
