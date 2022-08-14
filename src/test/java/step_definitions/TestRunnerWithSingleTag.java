package step_definitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FeaturesWithTags/", 
		glue = { "step_definitions" }, 
		tags = "@smoke")

public class TestRunnerWithSingleTag {

}
