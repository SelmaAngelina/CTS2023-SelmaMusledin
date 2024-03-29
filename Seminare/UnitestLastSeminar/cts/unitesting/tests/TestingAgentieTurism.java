package cts.unitesting.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import cts.unitesting.mock.FakePachet;
import cts.unitesting.models.AgentieTurism;
import cts.unitesting.models.IPachetTuristic;

public class TestingAgentieTurism {

	@Tag("tag1")
	@Test
	void testPretPachetTuristic() {
		FakePachet pachet = new FakePachet();
		
		FakePachet p1 = new FakePachet();
		
		FakePachet p2 = new FakePachet();
		
		pachet.setSpecialPrice(100);
		p1.setSpecialPrice(30);
		p2.setSpecialPrice(10);
		
		AgentieTurism ag = new AgentieTurism();
		ag.adaugaPachet(pachet);
		ag.adaugaPachet(p1);
		ag.adaugaPachet(p2);
		
		assertEquals(140,ag.calculareSumaTotalaPachete());
	}

}
