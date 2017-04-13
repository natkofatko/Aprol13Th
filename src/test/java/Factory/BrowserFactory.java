package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataProvider.ConfigDataProvider;

public class BrowserFactory {
	static WebDriver driver; 
	
	public static WebDriver getBrowser (String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			ConfigDataProvider cdp = new ConfigDataProvider(); 
			System.setProperty("webdriver.gecko.driver", cdp.getFirefoxDrive()) ; 
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			 
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromeDrive()); 
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			ConfigDataProvider cdp = new ConfigDataProvider(); 
			System.setProperty("webdriver.edge.driver", cdp.getEdgeDrive()); 
			driver= new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		return driver; 
	}

	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
}
