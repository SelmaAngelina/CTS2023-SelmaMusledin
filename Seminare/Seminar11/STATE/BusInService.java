package STATE;

public class BusInService implements IBusState {

	@Override
	public void changeState(Bus bus) {
		if(bus.getState() instanceof BusEndOfLine) {
			System.out.println("The bus " + bus.getLicensePlate() + " has left to the service.");
			bus.setState(this);
		}
		else {
			System.out.println("The bus " + bus.getLicensePlate() + " cannot leave in the new route.");
		}
		
	}

}
