package COMMAND;

public class Autobuz implements Automobil {

	private int nr;
	
	public Autobuz(int nr) {
		this.nr = nr;
	}
	@Override
	public void plecareCursa(int nrLinie) {
		System.out.println("Autobuzl "+ this.nr+ " a plecat in cursa pe linia "+ nrLinie);
	}

}
