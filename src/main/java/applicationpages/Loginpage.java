package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Actionspage {
	
	
	public Loginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	WebElement signInLink;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement passWord;
	
	@FindBy(xpath="//button[@id='send2']")
	WebElement signInBtn;
	
	
	public void clickSignInLink()
	{
		signInLink.click();
	}
	
	public void login(String username, String password)
	{
		userName.sendKeys(username);
		passWord.sendKeys(password);
		signInBtn.click();
	}

}
