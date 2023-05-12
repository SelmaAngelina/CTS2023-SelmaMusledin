package STATE;

public class Bus {
	private IBusState state;
	private String licensePlate;
		
	public Bus(String licensePlate) {
		this.state = new BusEndOfLine();
		this.licensePlate = licensePlate;
	}
	public IBusState getState() {
		return state;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	
	//not everyone can access it
	protected void setState(IBusState state) {
		this.state = state;
	}
	
	public void leaveForRoute() {
		IBusState inRoute = new BusInRoute();
		inRoute.changeState(this);
	}
	
	public void goInService() {
		IBusState inService = new BusInRoute();
		inService.changeState(this);
	}
	
	public void arriveAtEndOfLine() {
		IBusState end = new BusEndOfLine();
		end.changeState(this);
	}
	
	
}
