package main;

import Builder.AbstractBuilder;
import Builder.Builder;
import Builder.BuilderV2;
import Builder.Reservation;

public class Main1 {

	public static void main(String[] args) {
		AbstractBuilder builder = new Builder();
		
		builder.setterAmbientalMusic(true).setterMusicGenre("Jazz");
		
		Reservation reservation = builder.getReservation();
		
		System.out.println(reservation.toString());
		
		//Reservation reservation2 = builder.getReservation();
		
		AbstractBuilder builder2 = new BuilderV2();
		Reservation reservation2 = builder2.setterAmbientalMusic(true).setterMusicGenre("rock").getReservation();
		System.out.println(reservation2.toString());
		
		Reservation reservation3 = builder2.setterAmbientalMusic(true).setterMusicGenre("pop").getReservation();
		System.out.println(reservation3.toString());
		
		Reservation res1 = new Builder().setterAmbientalMusic(true).getReservation();
		System.out.println(res1.toString());

	}

}
