package cts.unitesting.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cts.unitesting.mock.FakePerson;
import cts.unitesting.models.PachetTuristic;

public class TestingPachetTuristicDiscount{
	
	@Test
	void shouldApplyDiscountForSenior() {
		FakePerson fakePerson = new FakePerson();
		fakePerson.setGetVarstaValue(66);

		PachetTuristic pachet = new PachetTuristic(fakePerson, "Grecia", 1000.0);
		pachet.aplicaDiscountVarstnici(15);
		
		assertEquals(850,pachet.getPret());
	}
	
	@Test
	void shouldNotApplyDiscountForSenior() {
		FakePerson fakePerson = new FakePerson();
		fakePerson.setGetVarstaValue(50);

		PachetTuristic pachet = new PachetTuristic(fakePerson, "Bulgaria", 1000.0);
		pachet.aplicaDiscountVarstnici(25);
		
		assertEquals(1000,pachet.getPret());
	}
	

}
