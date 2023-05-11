package Main;

import Adapter.Classes.Existent.Credit;
import Adapter.Classes.Existent.CreditAdapterClass;
import Adapter.Classes.Existent.CreditIpotecar;
import Adapter.Classes.Nou.CreditLeasing;
import AdapterObjects.Classes.CreditAdapterObject;

public class Main {
	
	public static void afiseazaCredit(int suma, Credit c) {
		c.oferaCredit(suma);
	}

	public static void main(String[] args) {
		
		Credit creditIpotecar = new CreditIpotecar();

		afiseazaCredit(1000,creditIpotecar);
		
		CreditLeasing leasing = new CreditLeasing();
		
		Credit adapter = new CreditAdapterClass();
		afiseazaCredit(2000,adapter);
	
		
		Credit creditAdapterObject = new CreditAdapterObject(leasing);
		afiseazaCredit(10,creditAdapterObject);

	}

}
