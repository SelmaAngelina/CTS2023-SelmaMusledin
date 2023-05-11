package Observer;

public interface IRestaurant {
	//resturantul este cel observat
	public void abonareClient(IClient client);
	
	public void dezabonareClient(IClient client);
	
	public void trimiteNotificare(String mesaj);

}
