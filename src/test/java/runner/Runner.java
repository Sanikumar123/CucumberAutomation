package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/java/features",
		glue="stepdefinitions" ,dryRun=false,monochrome=true,
		plugin= {"pretty","html:target/cucmber.html"})

public class Runner extends AbstractTestNGCucumberTests {
	
	

}