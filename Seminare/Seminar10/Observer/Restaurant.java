package Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
	
	List<IClient> clienti;
	private String nume;
	
	
	public Restaurant(String nume) {
		this.nume = nume;
		clienti = new ArrayList<IClient>();
	}
	
	
	@Override
	public void abonareClient(IClient client) {
		clienti.add(client);
		
	}

	@Override
	public void dezabonareClient(IClient client) {
		clienti.remove(client);
		
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		for(IClient c : clienti) {
			c.primesteNotificare("Restaurantul " + this.nume + " iti trimite notificarea: " + mesaj);
		}
	}
	
	public void adaugaMeniuNou() {
		trimiteNotificare("Am adaugat un meniu nou!");
	}
	
	public void adaugareDiscount(int discount) {
		trimiteNotificare("Hei! Am aduagat un discount de " + discount + "% pentru toate produsele!");
	}
	

}
