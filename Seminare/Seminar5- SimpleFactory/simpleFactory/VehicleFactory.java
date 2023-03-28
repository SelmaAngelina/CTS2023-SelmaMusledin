package simpleFactory;

public class VehicleFactory {
	
	public TransportVehicle createObject(TransportType type, int noSeats) throws Exception {
		switch (type) {
		case Bus:
			return new Bus(noSeats);
		
		case Tram:
			return new Tram(noSeats);
		
		case Trolley:
			return new Trolley(noSeats);
		
		case Subway:
			return new Subway(noSeats);
			
		default:
			throw new Exception("No such type");
		}
			
		
	}

}
