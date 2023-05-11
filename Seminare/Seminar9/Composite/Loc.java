package Composite;

public class Loc implements IComponentaAbstract{
	
	private int rand;
	private int numar;

	public Loc(int rand, int numar) {
		this.rand = rand;
		this.numar = numar;
	}

	@Override
	public void adaugaNod(IComponentaAbstract nod) throws Exception {
		throw new Exception("Not yet implemented!");
		
	}

	@Override
	public void stergeNod(IComponentaAbstract nod) throws Exception {
		throw new Exception("Not yet implemented!");
		
	}

	@Override
	public IComponentaAbstract getNodCopil(int index) throws Exception {
		throw new Exception("Not yet implemented!");
	}

	@Override
	public void afiseazaComponenta(String indentare) {
		System.out.println(indentare + "LOCUL: " + this.numar + "RANDUL: " + this.rand);
		
	}

}
