package cts.unitesting.mock;

import cts.unitesting.models.IPachetTuristic;

public class FakePachet implements IPachetTuristic{
	
	private double specialPrice;

	@Override
	public boolean poateRezerva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getPret() {
		return this.specialPrice;
	}

	public void setSpecialPrice(double specialPrice) {
		this.specialPrice = specialPrice;
	}
	
	

}
