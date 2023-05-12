package COMMAND;

public class ComandaPlecareCursa implements IComand{

	private int nrLinie;
	
	private Automobil automobil;
	
	

	public ComandaPlecareCursa(int nrLinie, Automobil automobil) {
		this.nrLinie = nrLinie;
		this.automobil = automobil;
	}



	@Override
	public void execute() {
		automobil.plecareCursa(this.nrLinie);
		
	}
	
}
