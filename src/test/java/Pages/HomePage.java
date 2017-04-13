package Pages;

import org.openqa.selenium.
WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver; 
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver; 
	}
	
	
	@FindBy(xpath = "//*[@id='menu-item-17']/a") WebElement ShopLink; 
	@FindBy(xpath = "//*[@id='menu-item-16']/a") WebElement CartLink; 
	@FindBy (xpath = "//*[@id='menu-item-14']/a") WebElement MyAccountLink; 
	@FindBy(xpath = "//*[@id='menu-item-163']/a") WebElement PagesLink; 

	public void ClickOnSignLoink()
	{
		ShopLink.click();
	}
	
	public void ClickOnCartLink()
	{
		CartLink.click();
	}
	
	public void ClickOnMyAccountLink()
	{
		MyAccountLink.click();
	}
	public void clickOnMyPageLink()
	{
		PagesLink.click();
	}
	
	public String getTitle()
	{
		return driver.getTitle(); 
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl(); 
	}
	
	
	
}
