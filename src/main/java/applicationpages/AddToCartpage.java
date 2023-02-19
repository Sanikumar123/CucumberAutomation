package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartpage extends Actionspage {
	
	WebDriver driver;
	
	public AddToCartpage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[text()='Next']")
	WebElement nextBtn;

	@FindBy(xpath="(//button[@type='submit'])[3]")
	WebElement placeOrderBtn;
	
	@FindBy(xpath="//*[text()='Thank you for your purchase!']")
	WebElement OrderPlacedMessage;
	
	
	public void clickNextBtn()
	{
		waitTime(10000l);
		//nextBtn.click();
		click(nextBtn);
	}
	
	public void placeOrderBtnBtn()
	{
		waitTime(15000l);
		moveToElement(placeOrderBtn);
		click(placeOrderBtn);
	}
	
	public String OrderPlacedMessage()
	{
		waitTime(5000l);
		String expected = OrderPlacedMessage.getText();
		return expected;
	}
	
	
	
}
