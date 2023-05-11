package Decorator;

public abstract class AbstractDecorator implements ICard {
	
	ICard card;
	
	public AbstractDecorator(ICard newCard) {
		this.card = newCard;
	}
	
	public abstract void payContactless(double sum);

	@Override
	public void payOnline(double sum) {
		card.payOnline(sum);	
	}

	@Override
	public void payPOS(double sum) {
		card.payPOS(sum);
	}
}
