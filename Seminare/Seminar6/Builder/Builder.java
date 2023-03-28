package Builder;

public class Builder implements AbstractBuilder {
	
	Reservation reservation;
	
	

	public Builder() {
		this.reservation = new Reservation(false,false,false,false,null);
	}


	@Override
	public  Reservation getReservation() {
		return reservation;

	}
	
	public AbstractBuilder setterIsWindowPosition(boolean isWindowPosition) {
		reservation.setWindowPosition(isWindowPosition);
		return this;
		
	}
	
	public AbstractBuilder setterErgoChairs(boolean isErgoChairs) {
		reservation.setErgoChairs(isErgoChairs);
		return this;
	}

	public AbstractBuilder setterTableDecorated(boolean isTableDecorated) {
		reservation.setTableDecorated(isTableDecorated);
		return this;
	}

	public AbstractBuilder setterAmbientalMusic(boolean isAmbientalMusic) {
		reservation.setAmbientalMusic(isAmbientalMusic);
		return this;
	}


	public AbstractBuilder setterMusicGenre(String musicGenre) {
		reservation.setMusicGenre(musicGenre);
		return this;
	}

}
