package singleton;

public class DirectorGeneral {
	private String nume;
	private int varsta;
	
	//LAZY INITIALISATION -> we don't instantiate here
	private static DirectorGeneral instanta = null;
	
	
	private DirectorGeneral(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	
	}
	
	//sync so it cannot be called on two separate threads
	public synchronized static DirectorGeneral getInstance(String nume) {
		//we only instantiate when null
		if (instanta == null) {
			instanta = new DirectorGeneral(nume, 30);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return this.nume + " " + this.varsta;
	}
	
	
	
	
}
