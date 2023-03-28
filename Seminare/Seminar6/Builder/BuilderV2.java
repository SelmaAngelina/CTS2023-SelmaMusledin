package Builder;

public class BuilderV2 implements AbstractBuilder {
	
	private boolean isWindowPosition;
	
	private boolean isErgoChairs;
	
	private boolean isTableDecorated;
	
	private boolean isAmbientalMusic;
	
	private String musicGenre;
	
	

	public BuilderV2() {
		this.isWindowPosition = false;
		this.isErgoChairs = false;
		this.isTableDecorated = false;
		this.isAmbientalMusic = false;
		this.musicGenre = null;
	}

	@Override
	public Reservation getReservation() {
		return new Reservation(this.isWindowPosition,this.isErgoChairs,
				this.isTableDecorated,this.isAmbientalMusic, this.musicGenre);
		
	}

	@Override
	public AbstractBuilder setterIsWindowPosition(boolean isWindowPosition) {
		this.isWindowPosition = isWindowPosition;
		return this;
	}

	@Override
	public AbstractBuilder setterErgoChairs(boolean isErgoChairs) {
		this.isErgoChairs = isErgoChairs;
		return this;
	}

	@Override
	public AbstractBuilder setterTableDecorated(boolean isTableDecorated) {
		this.isTableDecorated = isTableDecorated;
		return this;
	}

	@Override
	public AbstractBuilder setterAmbientalMusic(boolean isAmbientalMusic) {
		this.isAmbientalMusic = isAmbientalMusic;
		return this;
	}

	@Override
	public AbstractBuilder setterMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
		return this;
	}
	

}
