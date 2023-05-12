package STRATEGY;

public class PlataSMS implements TipPlata{

	@Override
	public void plateste(double pretBilet) {
		System.out.println("Plata in valoarte de:" + pretBilet+" a fost efectuata prin SMS.");

		
	}

}
