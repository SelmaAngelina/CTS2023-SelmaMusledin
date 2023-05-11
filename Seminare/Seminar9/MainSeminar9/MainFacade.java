package MainSeminar9;

import Facade.Bilet;
import Facade.Client;
import Facade.Facade;

public class MainFacade {

	public static void main(String[] args) {
		Client Gigel = new Client("Gigel", "1234567890123");
        Bilet biletGigel = new Bilet("Gigel");
        
        Client Marin = new Client("Marin", "4564564564564");
        Bilet biletMarin = new Bilet("Marin");
        
        Client Sorin = new Client("Sorin", "7892346712970");
        
        Facade facade = new Facade();
        
        facade.permiteIntrarea(Gigel, biletGigel);
        facade.permiteIntrarea(Marin, biletMarin);
        facade.permiteIntrarea(Sorin, biletMarin);

	}

}
