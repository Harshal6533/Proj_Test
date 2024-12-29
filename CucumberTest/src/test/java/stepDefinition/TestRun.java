package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/AmazonSearch.feature",
		glue = {"stepDefinition"},
		dryRun = false,
		
		plugin = {"json:target/cucumber.json"},
		monochrome = false
		
		
		)

public class TestRun {

}
