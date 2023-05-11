package Adapter.Classes.Existent;

import Adapter.Classes.Nou.CreditLeasing;

public class CreditAdapterClass extends CreditLeasing implements Credit{

	@Override
	public void oferaCredit(int suma) {
		
		super.oferaLeasing(suma);
		
	}

}
