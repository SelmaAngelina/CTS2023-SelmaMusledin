package AdapterObjects.Classes;

import Adapter.Classes.Existent.Credit;
import Adapter.Classes.Nou.CreditLeasing;

public class CreditAdapterObject implements Credit {
	
	private CreditLeasing credit;
	
	public CreditAdapterObject(CreditLeasing c) {
		this.credit = c;
	}

	@Override
	public void oferaCredit(int suma) {
		
		this.credit.oferaLeasing(suma);
		
	}

}
