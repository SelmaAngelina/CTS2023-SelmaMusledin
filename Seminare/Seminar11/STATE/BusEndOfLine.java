package STATE;

public class BusEndOfLine implements IBusState {

	@Override
	public void changeState(Bus bus) {
		if(bus.getState() instanceof BusEndOfLine || bus.getState() instanceof BusInService) {
			System.out.println("The bus " + bus.getLicensePlate() + " reached the end of line.");
			bus.setState(this);
		}
		else {
			System.out.println("The bus " + bus.getLicensePlate() + " cannot reach end of line.");
		}
	}

}
