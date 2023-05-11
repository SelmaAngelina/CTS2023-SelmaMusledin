package FlyWeight;

public class Client implements IClient {
	
	private String nume;
	
	private String nrTelefon;
	
	private String adresaEmail;	

	public Client(String nume, String nrTelefon, String adresaEmail) {
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
	}

	@Override
	public void afiseazaDetaliiRezervare(Rezervare rezervare) {
		System.out.println("Clientul: " + this.nume +" cu adresa: "+ this.adresaEmail+" si nr. "+this.nrTelefon + " a rezervat " + rezervare.getNrMasa() + " pentru " + rezervare.getNrPersoane() + " persoane la ora " + rezervare.getOraRezervare());
		
	}

}
