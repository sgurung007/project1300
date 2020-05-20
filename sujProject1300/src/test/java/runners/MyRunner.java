package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"features/bbcUSA.feature"},
		glue = {"stepDefinitions"},
		//tags= {"@bbc"},
		monochrome = true,
		dryRun =false,
		plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class MyRunner extends AbstractTestNGCucumberTests {
	
	

}
