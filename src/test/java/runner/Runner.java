package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/java/features",
		glue="stepdefinitions" ,dryRun=true,monochrome=false,
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner extends AbstractTestNGCucumberTests {
	
	//parallel execution
		@Override
		@DataProvider(parallel=false)
		public Object[][] scenarios()
		{
			return super.scenarios();
		}
	

}
