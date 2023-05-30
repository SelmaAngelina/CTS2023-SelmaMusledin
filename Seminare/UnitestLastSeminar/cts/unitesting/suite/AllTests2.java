package cts.unitesting.suite;

import org.junit.experimental.categories.Categories;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cts.unitesting.tests.TestingAgentieTurism;
import cts.unitesting.tests.TestingPachetTuristic;
import cts.unitesting.tests.TestingPachetTuristicDiscount;

@RunWith(Categories.class)
@SuiteClasses({TestingAgentieTurism.class, TestingPachetTuristic.class, TestingPachetTuristicDiscount.class})
@IncludeTags({"tag1"})
public class AllTests2 {

}
