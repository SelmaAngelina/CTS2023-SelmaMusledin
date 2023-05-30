package cts.unitesting.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cts.unitesting.mock.StubPersoanaMinora;
import cts.unitesting.models.IPersoana;
import cts.unitesting.models.PachetTuristic;
import cts.unitesting.models.Person;

public class TestingPachetTuristic {

	@Test
	void testPoateRezerva() {
		IPersoana persoana = new Person();
		
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, null, null);
		assertTrue(pachetTuristic.poateRezerva());
	}
	
	@Test
	void testNuPoateRezerva() {
		IPersoana persoana = new StubPersoanaMinora();
		
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, null, null);
		assertFalse(pachetTuristic.poateRezerva());
	}
	
	
}
