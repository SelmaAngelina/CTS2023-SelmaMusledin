package FlyWeight;

import java.util.HashMap;
import java.util.Map;

//like Singleton Registry
public class FactoryClienti {
	
	private Map<String, IClient> clienti;
	
	public FactoryClienti() {
		clienti = new HashMap<String,IClient>();
	}
	
	public IClient getClient (String nume, String adresaEmail, String nrTelefon) {
		if(clienti.containsKey(nrTelefon)) {
			return clienti.get(nrTelefon);
		}
		else {
			IClient client = new Client(nume,nrTelefon,adresaEmail);
			clienti.put(nrTelefon, client);
			return client;
		}
	}

}
