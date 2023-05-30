package models;

public class SMSNotificator extends INotificare{
	public SMSNotificator(INotificare nextNotif) {
		super(nextNotif);
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		if(client.getNrTel()!=null) {
			System.out.println("Clientul "+ client.getNume() + " ai primit sms cu mesajul "
					+  mesaj);
		}
		else if(super.getNextNotif()!=null) {
			super.getNextNotif().trimiteNotificare(client, mesaj);
		}
		else {
			System.out.println("Problema nu poate fi rezolvata!");
		}
		
	}
}
