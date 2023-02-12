package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/java/features/Loginpage.feature",
		glue="stepdefinitions" ,dryRun=true,monochrome=true,tags="@Login_Datatable or not @Login_Validation",
		plugin= {"pretty","html:target/cucmber.html"})

public class LoginpageRunner extends AbstractTestNGCucumberTests {
	
	

}
