package FactoryMethod;

public class Troleibuz extends TransportVehicle {

	public Troleibuz(int noSeats) {
		super(noSeats);
	}

	@Override
	public void showInfo() {
		System.out.println("The trolley " + super.toString());
		
	}

	@Override
	public void moveType() {
		System.out.println("trolley is electric");
	}

}
