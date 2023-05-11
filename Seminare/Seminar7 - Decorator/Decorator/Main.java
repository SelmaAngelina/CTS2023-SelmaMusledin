package Decorator;

public class Main {

	public static void main(String[] args) {
		ICard card = new Card();
		card.payOnline(10);
		
		AbstractDecorator decorator = new CardContactless(card);
		decorator.payContactless(100);
		
		AbstractDecorator decorator2 = new CardContactlessVirtual(card);
		decorator2.payContactless(20);
	}

}
