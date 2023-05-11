package Observer;

public class Client implements IClient{
	
	private String nume;

	public Client(String nume) {
		this.nume = nume;
	}
	
	
	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	@Override
	public void primesteNotificare(String mesaj) {
			System.out.println("Hei " + this.nume+ "! Ai primit urmatoare notificare: " + mesaj);
	}

}
