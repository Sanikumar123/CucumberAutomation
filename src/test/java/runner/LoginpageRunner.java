package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/java/features/Loginpage.feature",
		glue="stepdefinitions" ,dryRun=true,monochrome=true,tags="@Login_Datatable or not @Login_Validation",
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class LoginpageRunner extends AbstractTestNGCucumberTests {
	
	//parallel execution
		@Override
		@DataProvider(parallel=false)
		public Object[][] scenarios()
		{
			return super.scenarios();
		}

}
