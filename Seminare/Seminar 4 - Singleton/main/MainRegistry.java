package main;

import singletonRegistry.Firma;

public class MainRegistry {

	public static void main(String[] args) {
		Firma firma1 = Firma.getFirma("Murders&Co.");
		
		Firma firma2= Firma.getFirma("SC Ceva SRL");
		
		Firma firma3 = Firma.getFirma("Murders&Co.");
		
		firma1.angajare();
		
		firma2.angajare();
		
		firma3.angajare();
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());

	}

}
