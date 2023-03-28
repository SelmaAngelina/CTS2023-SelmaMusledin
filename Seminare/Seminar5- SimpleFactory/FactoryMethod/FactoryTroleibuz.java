package FactoryMethod;

public class FactoryTroleibuz implements Factory{

	@Override
	public TransportVehicle createObject(int noSeats) {
		return new Troleibuz(noSeats);
	}

}
