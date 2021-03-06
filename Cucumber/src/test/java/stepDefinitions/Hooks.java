package stepDefinitions;

import Cucumber_Practice.Cucumber.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

// In hooks we have both pre & post requisite but in background we only have pre-requisite

public class Hooks extends Base {

	@Before("@MobileTest") // This will run only before @SanityTest annotation in feature file
	public void beforeValidation() {
		System.out.println("Will run only before the scenario we provide with the annotation");
	}

	@After("@MobileTest") // This will run only before @SanityTest annotation in feature file
	public void afterValidation() {
		System.out.println("Will run only after the scenario we provide with the annotation");
	}

	@Before("@RegTest") // This will run only before @SanityTest annotation in feature file
	public void beforeValidationReg() {
		System.out.println("Will run only before  the Reg scenario we provide with the annotation");
	}

	@After("@RegTest") // This will run only before @SanityTest annotation in feature file
	public void afterValidationReg() {
		System.out.println("Will run only after the Reg scenario we provide with the annotation");
	}

	@After("@SeleniumTest") // This will run only before @SeleniumTest annotation in feature file
	public void afterSeleniumTest() {
		driver.close();
	}

}
