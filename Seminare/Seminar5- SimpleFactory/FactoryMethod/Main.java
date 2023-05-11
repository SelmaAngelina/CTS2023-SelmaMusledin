package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Factory f1 = new FactoryTramvai();
		
		Tramvai t1 = (Tramvai) f1.createObject(10);
		t1.showInfo();
		f1.createObject(20).showInfo();
		
		
		
		

	}

}
