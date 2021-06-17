package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.en.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
				features= {"C:\\Users\\sushils\\git\\SeleniumJavaFreamwork1\\Test1\\features\\Login.feature"},
				glue= {"StepDefination"},
				dryRun=true,
				monochrome=true,
				plugin= {"pretty",
						"html:test-ouput"}
				)
public class TestRun {
	
	

}
