package MainSeminar10;

import Observer.Client;
import Observer.IClient;
import Observer.IRestaurant;
import Observer.Restaurant;

public class MainOBS {

	public static void main(String[] args) {
		IClient client1 = new Client("ANDREI");
		IClient client2 = new Client("ROXANA");
		IClient client3 = new Client("MARIA");
		
		Restaurant restaurant = new Restaurant("Casa Buna");
		restaurant.abonareClient(client1);
		restaurant.abonareClient(client2);
		restaurant.abonareClient(client3);
		
		restaurant.adaugaMeniuNou();
		restaurant.trimiteNotificare("MENIU NOU");
	}

}
