package step_definitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/BackgroundDemo/backgroundDemo.feature", 
		glue = { "" }, 
		monochrome = true, 
		plugin = {
				"pretty", "junit:target/JunitReports/report.xml", 
				"json:target/JsonReports/report.json",
				"html:target/HtmlReports/report" })

public class TestRunnerForHooks {
	

}
