package models;

public class Manager extends INotificare{
	public Manager(INotificare nextNotif) {
		super(nextNotif);
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {

		System.out.println("Domnule manager nu avem date de contact pentru clientul " +
		client.getNume());
		
	}
}
