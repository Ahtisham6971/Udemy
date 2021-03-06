package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", stepNotifications = true, tags = "@RegressionTest", monochrome = true, plugin = {
		"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml" })
public class TestRunner {

}

//stepNotifications for printing given,when,then applicable only for junit not for testNG

//tags is used to run particular group test

//tags ="not @SanityTest" run all test except @SanityTest

//tags ="@RegTest and @SmokeTest" run only test which has both tag

//Cucumber has a tight integration with Junit therefore it is recommended to use Junit test runner

//plugin is used to generate report,pretty is used to generate color & html:target/cucumber is used to define the path & type of report you want to generate

// "json:target/cucumber.json" if we use this we get json report share this with developer to get customize report

// "junit:target/cukes.xml" used for junit reporting

//dryRun = true is used to check mapping is done or not it will not inside the code.It only check mapping to scenario done or not.It is same as pretty gherkin tool avoid using it every time

//monochrome = true is used to print need output if we don't use monochrome = true we will get additional output with @,? symbol 