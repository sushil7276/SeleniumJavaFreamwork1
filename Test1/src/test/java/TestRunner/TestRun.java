package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
				features= {"C:\\Users\\sushils\\eclipse-workspace\\Test1\\features\\Login.feature"},
				glue= {"StepDefination"},
				dryRun=true,
				monochrome=true,
				plugin= {"pretty",
						"html:test-ouput"}
				)
public class TestRun {
	
	

}
