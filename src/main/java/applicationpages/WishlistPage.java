package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
	
WebDriver driver;
	
	public WishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[contains(text(),'has been added to your Wish List')]")
	WebElement addedProductDisplaymessage;
	
	public String addedProductDisplaymessage()
	{
		return addedProductDisplaymessage.getText();
	}

}
