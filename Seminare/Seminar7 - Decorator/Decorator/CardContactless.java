package Decorator;

public class CardContactless extends AbstractDecorator{


	public CardContactless(ICard newCard) {
		super(newCard);
	}

	@Override
	public void payContactless(double sum) {
		System.out.println("Plata contactless cu cardul in valoare de:" + sum);		
	}

}
