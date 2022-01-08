package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions")

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}

//In Junit we use @RunWith annotation to trigger our feature file whereas in testNg we extends AbstractTestNGCucumberTests
