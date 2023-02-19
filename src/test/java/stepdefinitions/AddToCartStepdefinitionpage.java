package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import applicationpages.AddToCartpage;
import applicationpages.PageObjectManager;
import io.cucumber.java.en.Then;
import utility.TestContextSetup;

public class AddToCartStepdefinitionpage {
	
	WebDriver driver;
	PageObjectManager pageObjectManager;
	AddToCartpage addToCartpage;
	
	TestContextSetup testContextSetup;
	public AddToCartStepdefinitionpage(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	
    @Then("^product is added to the Cart and can be order successfully$")
    public void product_is_added_to_the_cart_and_can_be_order_successfully()  {
    	
    	addToCartpage = testContextSetup.pageObjectManager.addToCartpage();
    	addToCartpage.clickNextBtn();
    	/* try {
 			Thread.sleep(5000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}*/
    	addToCartpage.placeOrderBtnBtn();
    	 /*try {
 			Thread.sleep(5000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}*/
    	String expected = "Thank you for your purchase!";
    	String actual = addToCartpage.OrderPlacedMessage();
    	Assert.assertEquals(actual, expected);
       
    }

}
