package simpleFactory;

public class Bus implements TransportVehicle {

	private int noSeats;
	
	protected Bus(int noSeats) {
		this.noSeats = noSeats;
	}
	
	public void showInfo() {
		System.out.println("The bus has a total of " + this.noSeats + " seats.");
		
	}

	public void movingType() {
		System.out.println("The bus is moving by wheels.");
		
	}
	

}
