package STRATEGY;

public class MainStrategy {

	public static void main(String[] args) {
		
		Calator c1 = new Calator("Dinca Vlad");
		c1.platesteBilet(10);
		c1.setMetodaPlata(new PlataSMS());
		c1.platesteBilet(5);

	}

}
