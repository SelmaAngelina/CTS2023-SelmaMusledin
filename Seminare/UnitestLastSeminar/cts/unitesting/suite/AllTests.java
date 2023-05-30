package cts.unitesting.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cts.unitesting.tests.TestingAgentieTurism;
import cts.unitesting.tests.TestingPachetTuristic;
import cts.unitesting.tests.TestingPachetTuristicDiscount;

@RunWith(Suite.class)
@SuiteClasses({TestingAgentieTurism.class, TestingPachetTuristic.class, TestingPachetTuristicDiscount.class})
public class AllTests {

}
