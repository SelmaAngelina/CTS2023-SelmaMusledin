package singleton;

public class Papa {
	private String nume;
	
	private int nrAniFunctie;
	
	private int alCatelea;
	
	//we will initialise this static attribute
	private static Papa papa = new Papa("Benedict", 2, 276);
	
	//private means called only from within the class
	private Papa(String nume, int nrAniFunctie, int alCatelea) {
		super();
		this.nume = nume;
		this.nrAniFunctie = nrAniFunctie;
		this.alCatelea = alCatelea;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNrAniFunctie() {
		return nrAniFunctie;
	}

	public void setNrAniFunctie(int nrAniFunctie) {
		this.nrAniFunctie = nrAniFunctie;
	}

	public int getAlCatelea() {
		return alCatelea;
	}

	public void setAlCatelea(int alCatelea) {
		this.alCatelea = alCatelea;
	}

	//must be static because it belongs to the class, not an object and therefore can be called
	public static Papa getInstance() {
		return papa; //EAGER INITIALISATION - constructor must be called only once; we initialise before using
		
		//static attributes are loaded ONLY when class is initialised
		//vs.
		//LAZY INITIALISATION -> only when calling the function
	}
	

}
