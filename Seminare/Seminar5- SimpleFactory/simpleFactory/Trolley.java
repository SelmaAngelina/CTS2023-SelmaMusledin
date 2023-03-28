package simpleFactory;

public class Trolley implements TransportVehicle {
	
	private int noSeats;

	public void showInfo() {
		System.out.println("The trolley has a total of " + this.noSeats + " seats.");
		
	}

	public void movingType() {
		System.out.println("The trolley is electric.");
		
	}

	protected Trolley(int noSeats) {
		this.noSeats = noSeats;
	}
	
	

}
