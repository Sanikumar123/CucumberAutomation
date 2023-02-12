package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import applicationpages.PageObjectManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utility.TestBase;
import utility.TestContextSetup;



public class Hooks {

TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {

		if(scenario.isFailed())
		{

		TakesScreenshot shot =(TakesScreenshot) testContextSetup.driver;
		byte[] fileContent = shot.getScreenshotAs(OutputType.BYTES);
		//byte[] fileContent = FileUtils.readFileToByteArray(source);
		scenario.attach(fileContent, "image/png", "screenshot");
		
		}
		
		
		}
	
	
	@After
	public void tearDown()
	{
		testContextSetup.driver.quit();
	}

	
	
}
