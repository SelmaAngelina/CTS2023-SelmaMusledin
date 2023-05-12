package STATE;

public class BusInRoute implements IBusState{

	@Override
	public void changeState(Bus bus) {
		if(bus.getState() instanceof BusEndOfLine) {
			System.out.println("The bus " + bus.getLicensePlate() + " has gone on route.");
			bus.setState(this);
		}
		else {
			System.out.println("The bus " + bus.getLicensePlate() + " cannot reach end of route.");
		}
		
	}
	
}
