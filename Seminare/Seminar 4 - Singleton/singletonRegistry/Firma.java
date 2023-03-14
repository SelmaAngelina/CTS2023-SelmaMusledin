package singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class Firma {

	private String nume;
	
	private int cifraAfaceri;
	
	private int nrAngajati;
	
	private static Map<String,Firma> firme = new HashMap<String, Firma>(); 

	private Firma(String nume, int cifraAfaceri, int nrAngajati) {
		this.nume = nume;
		this.cifraAfaceri = cifraAfaceri;
		this.nrAngajati = nrAngajati;
	}
	
	public synchronized static Firma getFirma(String numeFirma) {
		//we look through HashMap to see if we have a name
		if(!firme.containsKey(numeFirma)) {
			Firma f1 = new Firma(numeFirma,0,0);
			firme.put(numeFirma, f1);
		}
		return firme.get(numeFirma);
	}
	
	public void angajare() {
		this.nrAngajati++;
	}

	@Override
	public String toString() {
		return this.nume + " are " + this.nrAngajati + " angajati si " + this.cifraAfaceri;
	}
	
	
	
}
