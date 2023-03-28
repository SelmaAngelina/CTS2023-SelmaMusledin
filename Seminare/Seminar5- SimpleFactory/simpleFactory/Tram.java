package simpleFactory;

public class Tram implements TransportVehicle {
	
	private int noSeats; 

	public void showInfo() {
		System.out.println("The tram has a total of " + this.noSeats + " seats.");
		
	}

	public void movingType() {
		System.out.println("The tram is moving by rails.");
		
	}

	protected Tram(int noSeats) {
		this.noSeats = noSeats;
	}
	
	

}
