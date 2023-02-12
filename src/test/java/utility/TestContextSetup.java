package utility;

import org.openqa.selenium.WebDriver;

import applicationpages.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String expectedProductAdded;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	
	
	public TestContextSetup()
	{
		testbase = new TestBase();
		driver=testbase.setUp();
	   pageObjectManager = new PageObjectManager(driver);
	}

}
