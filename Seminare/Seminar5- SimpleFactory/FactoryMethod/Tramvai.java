package FactoryMethod;

public class Tramvai extends TransportVehicle {

	public Tramvai(int noSeats) {
		super(noSeats);
	}

	@Override
	public void showInfo() {
		System.out.println("The tram " + super.toString());
		
	}

	@Override
	public void moveType() {
		System.out.println("the tram moves by rails");
	}

}
