package Facade;

public class Client {
	private String nume;
	private String cnp;
	
	public Client(String nume, String cnp) {
		this.nume = nume;
		this.cnp = cnp;
	}

	public String getNume() {
		return nume;
	}

	public String getCnp() {
		return cnp;
	}
	
	
}
