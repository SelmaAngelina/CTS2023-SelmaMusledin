package Decorator;

public class Card implements ICard{

	@Override
	public void payOnline(double sum) {
		System.out.println("Plata online cu cardul in valoare de:" + sum);
		
	}

	@Override
	public void payPOS(double sum) {
		System.out.println("Plata POS cu cardul in valoare de:" + sum);
		
	}

}
