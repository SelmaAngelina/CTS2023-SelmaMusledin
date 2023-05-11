package Decorator;

public class CardContactlessVirtual extends AbstractDecorator{

	public CardContactlessVirtual(ICard newCard) {
		super(newCard);
	}
	
	public void payContactless(double sum) {
		System.out.println("S-a platit cu cardul virtual:" + sum);
	}

}
