package Composite;

public interface IComponentaAbstract {
	
	public void adaugaNod(IComponentaAbstract nod) throws Exception;
	
	public void stergeNod(IComponentaAbstract nod) throws Exception;
	
	public IComponentaAbstract getNodCopil(int index) throws Exception;
	
	public void afiseazaComponenta(String indentare);
	
}
