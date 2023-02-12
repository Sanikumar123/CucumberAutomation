package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import applicationpages.WishlistPage;
import io.cucumber.java.en.Then;
import utility.TestContextSetup;


public class WishlistpageStepdefinitionpage {
	
	TestContextSetup testContextSetup;
	public WebDriver driver;
	WishlistPage wishlistPage;
	
	public WishlistpageStepdefinitionpage(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Then("Wishlist page opens and displays same added shirt")
	public void wishlist_page_opens_and_displays_same_added_shirt() {
		
		wishlistPage=new WishlistPage(testContextSetup.driver);
	   
		String textValue = wishlistPage.addedProductDisplaymessage();
		String actualProductValue = textValue.substring(0, 11);
		System.out.println(actualProductValue);
		Assert.assertEquals(textValue, testContextSetup.expectedProductAdded);
	}

}
