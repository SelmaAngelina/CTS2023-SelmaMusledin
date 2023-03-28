package main;

import java.util.ArrayList;
import java.util.List;

import simpleFactory.Bus;
import simpleFactory.TransportType;
import simpleFactory.TransportVehicle;
import simpleFactory.VehicleFactory;

public class Main {

	public static void main(String[] args) {
		
		VehicleFactory factory = new VehicleFactory();
		try {
			TransportVehicle bus = factory.createObject(TransportType.Bus,20);
			
			TransportVehicle tram = factory.createObject(TransportType.Tram, 30);
			
			TransportVehicle trolley = factory.createObject(TransportType.Trolley, 10);
	
			
			List<TransportVehicle> list = new ArrayList<>();
			list.add(trolley);
			list.add(tram);
			list.add(bus);
			
			list.add(factory.createObject(TransportType.Bus, 0));
			list.add(factory.createObject(TransportType.Tram, 50));
			list.add(factory.createObject(TransportType.Subway, 15));
			
			
			for(TransportVehicle t : list) {
				t.showInfo();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
