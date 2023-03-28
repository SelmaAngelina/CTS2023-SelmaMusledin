package Builder;

public interface AbstractBuilder {
	
	public abstract Reservation getReservation();
	
	public AbstractBuilder setterIsWindowPosition(boolean isWindowPosition);

	public AbstractBuilder setterErgoChairs(boolean isErgoChairs);

	public AbstractBuilder setterTableDecorated(boolean isTableDecorated);

	public AbstractBuilder setterAmbientalMusic(boolean isAmbientalMusic);


	public AbstractBuilder setterMusicGenre(String musicGenre);

}
