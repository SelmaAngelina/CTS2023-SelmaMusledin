package Composite;

import java.util.ArrayList;
import java.util.List;

public class Tribuna implements IComponentaAbstract{
	
	// o tribuna are un nume si o lista de componente(randuri si scaune)
	private String nume;
	private List<IComponentaAbstract> listaComponente;
	
	// initializam tribuna
	public Tribuna(String nume) {
		this.nume = nume;
		listaComponente = new ArrayList<>();
	}

	@Override
	public void adaugaNod(IComponentaAbstract nod) throws Exception {
		listaComponente.add(nod);
		
	}

	@Override
	public void stergeNod(IComponentaAbstract nod) throws Exception {
		listaComponente.remove(nod);
		
	}

	@Override
	public IComponentaAbstract getNodCopil(int index) throws Exception {
		return listaComponente.get(index);
	}

	@Override
	public void afiseazaComponenta(String indentare) {
		System.out.println(indentare+"Tribuna "+this.nume+ " contine:");
		for (IComponentaAbstract componentaAbstracta : listaComponente) {
			componentaAbstracta.afiseazaComponenta(indentare+ "   ");
		}
		
		
	}

}
