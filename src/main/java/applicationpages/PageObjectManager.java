package applicationpages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	 WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	

	
	
	public Loginpage login()
	{
		Loginpage loginpage = new Loginpage(driver);
		return loginpage;
	}
	
	
	public Homepage homepage()
	{
		Homepage homepage = new Homepage(driver);
		return homepage;
	}
	
	
	public WishlistPage wishlistpage()
	{
		WishlistPage wishlistpage = new WishlistPage(driver);
		return wishlistpage;
	}

}
