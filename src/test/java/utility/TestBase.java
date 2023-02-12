package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	FileInputStream file;
	
	public WebDriver setUp()
	{
		try {
			 file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configuration\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		Properties prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(driver==null)
		{
			if(prop.getProperty("BROWSER_NAME").equals("chrome"))
			{
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91898\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();
			}else if(prop.getProperty("BROWSER_NAME").equals("firefox"))
			{
				//firefox
			}else if(prop.getProperty("BROWSER_NAME").equals("edge"))
			{
				//edge
			}
			
			 driver.get(prop.getProperty("TEST_URL"));
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
			 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("USERNAME"));
			 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("PASSWORD"));
			 driver.findElement(By.xpath("//button[@id='send2']")).click();
			 
			 
		}
		
		return driver;
	}

}
