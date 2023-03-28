package simpleFactory;

public class Subway implements TransportVehicle {
	
	private int noSeats;

	@Override
	public void showInfo() {
		System.out.println("The subway has a total of " + this.noSeats + " seats.");
		
	}

	@Override
	public void movingType() {
		System.out.println("The subway is moving underground.");
		
	}

	public Subway(int noSeats) {
		this.noSeats = noSeats;
	}
	
	

}
