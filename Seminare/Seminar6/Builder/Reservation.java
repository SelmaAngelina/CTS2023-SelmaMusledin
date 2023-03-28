package Builder;

public class Reservation {
	
	private boolean isWindowPosition;
	
	private boolean isErgoChairs;
	
	private boolean isTableDecorated;
	
	private boolean isAmbientalMusic;
	
	private String musicGenre;
	

	public Reservation(boolean isWindowPosition, boolean isErgoChairs, boolean isTableDecorated,
			boolean isAmbientalMusic, String musicGenre) {
		super();
		this.isWindowPosition = isWindowPosition;
		this.isErgoChairs = isErgoChairs;
		this.isTableDecorated = isTableDecorated;
		this.isAmbientalMusic = isAmbientalMusic;
		this.musicGenre = musicGenre;
	}

	protected void setWindowPosition(boolean isWindowPosition) {
		this.isWindowPosition = isWindowPosition;
	}

	protected void setErgoChairs(boolean isErgoChairs) {
		this.isErgoChairs = isErgoChairs;
	}

	protected void setTableDecorated(boolean isTableDecorated) {
		this.isTableDecorated = isTableDecorated;
	}

	protected void setAmbientalMusic(boolean isAmbientalMusic) {
		this.isAmbientalMusic = isAmbientalMusic;
	}


	protected void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reservation [isWindowPosition=");
		builder.append(isWindowPosition);
		builder.append(", isErgoChairs=");
		builder.append(isErgoChairs);
		builder.append(", isTableDecorated=");
		builder.append(isTableDecorated);
		builder.append(", isAmbientalMusic=");
		builder.append(isAmbientalMusic);
		builder.append(", musicGenre=");
		builder.append(musicGenre);
		builder.append("]");
		return builder.toString();
	}

	

}
