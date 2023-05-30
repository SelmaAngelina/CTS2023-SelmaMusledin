package models;

public class Client {
	private String nume;
	private String nrTel;
	private String email;
	
	public Client(String nume, String nrTel, String email) {
		super();
		this.nume = nume;
		this.nrTel = nrTel;
		this.email = email;
	}

	public String getNume() {
		return nume;
	}

	public String getNrTel() {
		return nrTel;
	}

	public String getEmail() {
		return email;
	}
}
