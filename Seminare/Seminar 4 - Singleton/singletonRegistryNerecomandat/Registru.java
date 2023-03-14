package singletonRegistryNerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	
	private static Map<String, Firma> firme = new HashMap<String,Firma>();
	
	public static Firma getFirma(String nume) {
		if (firme.containsKey(nume)) {
			firme.put(nume, new Firma(nume,9));
		}
		return firme.get(nume);
	}

}
