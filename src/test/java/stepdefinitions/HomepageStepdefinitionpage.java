package stepdefinitions;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import applicationpages.Homepage;
import applicationpages.Loginpage;
import applicationpages.PageObjectManager;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TestContextSetup;

public class HomepageStepdefinitionpage {
	
	WebDriver driver;
	Homepage homePage;
	Loginpage loginpage;
	String expectedProductAdded;
	PageObjectManager pageObjectManager;
	
TestContextSetup testContextSetup;
	
	public HomepageStepdefinitionpage(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Then("Applicaiton Homepage opens and displays message as {string}")
	public void applicaiton_homepage_opens_and_displays_message_as(String expected) {
	    
		homePage = testContextSetup.pageObjectManager.homepage();
		String actual =  homePage.verifyHomePageLands();
		Assert.assertEquals(actual, expected);
	}
	
	
	
	@Given("User searches product {string} in the search bar")
	public void user_searches_product_in_the_search_bar(String product) {
		
		homePage = testContextSetup.pageObjectManager.homepage();
		
		homePage.SearchProduct(product);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@When("selects size and color")
	public void selects_size_and_color() {
		
		testContextSetup.expectedProductAdded = homePage.selectProduct();
		System.out.println(expectedProductAdded);
	}
	@And("Clicks on Heart symbol")
	public void clicks_on_heart_symbol() {
	   
		homePage.clickWishListbtn();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
		

	}
	


	




