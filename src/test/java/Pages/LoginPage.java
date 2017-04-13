package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sun.jna.platform.win32.Netapi32Util.User;

public class LoginPage {
	
	WebDriver driver; 
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver; 
	}
	

	@FindBy(xpath= "//*[@id='username']") WebElement Username; 
	@FindBy(xpath= "//*[@id='password']") WebElement Pass;
	@FindBy(xpath="//*[@id='post-12']/div/div/form/p[3]/input[3]") WebElement submit;
	
	
	public String GetTite()
	{
		return driver.getTitle(); 		
	}
	
	public String GetCurrentUrl()
	{
		return driver.getCurrentUrl(); 
	}
	
	public void LogInToMyAccount(String User, String Password)
	{
	try{ 
		Username.clear();
	
	Thread.sleep(1000);
	Username.sendKeys(User);
	Thread.sleep(1000);
	Pass.clear();
	Thread.sleep(1000);
	Pass.sendKeys(Password);
	Thread.sleep(1000);
	submit.click();
	Thread.sleep(3000);
	}
	catch(Exception e )
	{
		System.out.println(e.getMessage());
		}
	}

}
