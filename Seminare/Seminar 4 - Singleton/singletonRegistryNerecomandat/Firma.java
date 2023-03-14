package singletonRegistryNerecomandat;

public class Firma {

	private String nume;
	
	private int nrAngajati;


	protected Firma(String nume, int nrAngajati) {
		this.nume = nume;
		this.nrAngajati = nrAngajati;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Firma [nume=");
		builder.append(nume);
		builder.append(", nrAngajati=");
		builder.append(nrAngajati);
		builder.append("]");
		return builder.toString();
	}
	
	
}
