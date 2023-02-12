/**
 * 
 */
package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import applicationpages.Loginpage;
import applicationpages.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TestContextSetup;

/**
 * @author 91898
 *
 */

public class LoginpageStepdefinitionpage {
	
	WebDriver driver;
	TestContextSetup testContextSetup;
	Loginpage loginPage;
	PageObjectManager pageObjectManager;
	
	public LoginpageStepdefinitionpage(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	

	@Given("User clicks on Sign In link")
	public void user_clicks_on_sign_in_link() {
	    
		  loginPage = testContextSetup.pageObjectManager.login();
		 loginPage.clickSignInLink();
	}

	@When("Enters {string} and {string} and Clicks on Sign In button")
	public void enters_and_and_clicks_on_sign_in_button(String username, String passwrod) {
	   
		loginPage.login(username, passwrod);
	}
	
	@When("^user Enters (.+) and (.+) and Clicks on Sign In button$")
    public void user_enters_and_and_clicks_on_sign_in_button(String username, String passwrod) throws Throwable {
        
		loginPage.login(username, passwrod);
    }	


	


}
