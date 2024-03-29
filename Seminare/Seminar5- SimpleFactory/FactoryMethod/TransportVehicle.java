package FactoryMethod;

public abstract class TransportVehicle {
	
	protected int noSeats;
	
	public  abstract void showInfo();
	
	public abstract void moveType();

	public TransportVehicle(int noSeats) {
		super();
		this.noSeats = noSeats;
	}

	@Override
	public String toString() {
		return "has " + this.noSeats + " seats";
	}
	
	
}
