package MainSeminar10;

import FlyWeight.FactoryClienti;
import FlyWeight.IClient;
import FlyWeight.Rezervare;

public class MainFlyweight {

	public static void main(String[] args) {
		FactoryClienti factory = new FactoryClienti();
		
		Rezervare masa1 = new Rezervare(1,2,"10:00");
		Rezervare masa2 = new Rezervare(2,5,"16:00");
		Rezervare masa3 = new Rezervare(3,1,"9:30");
		
		IClient client1 = factory.getClient("Andrei", "andrei10@gmail.com", "039238324");
		client1.afiseazaDetaliiRezervare(masa3);
		
		factory.getClient("Roxy", "roxy90@gmail.com", "04934343").afiseazaDetaliiRezervare(masa2);
		
		factory.getClient(null, null, "04934343").afiseazaDetaliiRezervare(masa1);
	}

}
