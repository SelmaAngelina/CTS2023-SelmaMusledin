package COMMAND;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<IComand> comenzi = new ArrayList<IComand>();
	
	public void invocaComanda(IComand comanda) {
		comenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(comenzi.size() == 0) {
			System.out.println("Nu avem ce comanda sa executam!");
		}
		else {
			comenzi.get(0).execute();
			comenzi.remove(comenzi.get(0));
		}
	}
	
	
}
