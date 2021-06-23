package cucumberStepDefinitions;

import cucumberDriver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends DriverManager {

	@Before
	public void executeBeforeScenario() {
		DriverManager.setupDriver();
	}

	@After
	public void executeAfterScenario() {
		DriverManager.quitDriver();
	}
}
