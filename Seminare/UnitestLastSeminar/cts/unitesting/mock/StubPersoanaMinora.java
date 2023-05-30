package cts.unitesting.mock;

import cts.unitesting.models.IPersoana;

public class StubPersoanaMinora implements IPersoana{
	
	public String getSex() {
		return "M";
	}
	
	@Override
	public boolean checkCNP() {
		return false;
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 17;
	}
	
}
