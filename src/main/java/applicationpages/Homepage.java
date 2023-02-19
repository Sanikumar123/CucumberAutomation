package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Actionspage {
	
	
	public Homepage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//div[@class='message global demo']/div/p")
	WebElement homepageHeader;
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchBar;
	
	@FindBy(xpath="//button[@title='Search']")
	WebElement searchBtn;
	
	@FindBy(xpath="//*[contains(text(),'Radiant Tee ')]")
	WebElement productAdded;
	
	@FindBy(xpath="(//div[@id='option-label-size-143-item-166'])[1]")
	WebElement productSize;
	
	@FindBy(xpath="(//div[@id='option-label-color-93-item-50'])[1]")
	WebElement productColor;
	
	@FindBy(xpath="(//a[@title='Add to Wish List'])[1]")
	WebElement wishListBtn;
	
	@FindBy(xpath="(//button[@title='Add to Cart'])[1]")
	WebElement AddToCartBtn;
	
	@FindBy(xpath="//a[@class='action showcart']")
	WebElement addToCartIconBtn;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	WebElement proceedToCheckOutBtn;
	
	
	public void SearchProduct(String Product)
	{
		searchBar.sendKeys(Product);
		searchBtn.click();
	}
	
	public String selectProduct()
	{
		String expectedProductAdded  = productAdded.getText();
		productSize.click();
		productColor.click();
		return expectedProductAdded;
		
	}
	
	public void clickWishListbtn()
	{
		wishListBtn.click();
	}

	
	
	public String verifyHomePageLands()
	{
		String actual = homepageHeader.getText().trim();
		return actual;
	}
	
	public void clickAddToCartbtn()
	{
		click(AddToCartBtn);
	}
	
	public void clickAddToCartIcon()
	{
		waitTime(3000l);
		click(addToCartIconBtn);
	}
	
	public void clickProceedToCheckoutBtn()
	{
		waitTime(5000l);
		click(proceedToCheckOutBtn);
	}
	
	
	

}
