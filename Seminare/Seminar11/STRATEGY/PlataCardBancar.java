package STRATEGY;

public class PlataCardBancar implements TipPlata {

	@Override
	public void plateste(double pretBilet) {
		System.out.println("Plata in valoarte de:" + pretBilet+" a fost efectuata cu cardule bancar.");
	}

}
