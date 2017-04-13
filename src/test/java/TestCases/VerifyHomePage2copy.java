package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.HomePage;
import Pages.LoginPage;
import Utility.Helper;

public class VerifyHomePage2copy {
	
	WebDriver driver; 
	HomePage home; 
	
	@BeforeMethod
	public void SetUpEverything()
	{
	driver = BrowserFactory.getBrowser("edge"); 
	driver.get(DataProviderFactory.getConfig().GetUrlAdress());
	}
	
	@Test
	public void TestCase02() throws Exception
	{
		
		home = PageFactory.initElements(driver, HomePage.class); 
		System.out.println(home.getTitle());
		LoginPage login = PageFactory.initElements(driver, LoginPage.class); 
	 
		home.ClickOnMyAccountLink();
		Thread.sleep(1000);
		home.clickOnMyPageLink();
		Helper.captureScreenshot(driver, "First Photo"); 
		home.ClickOnCartLink();
		Thread.sleep(1000);
		home.ClickOnSignLoink();
		Thread.sleep(1000);
		home.clickOnMyPageLink();
		Thread.sleep(1000);
		home.ClickOnSignLoink();

		Helper.captureScreenshot(driver, "second Photo"); 
		home.ClickOnMyAccountLink();
		System.out.println(login.GetTite()); 
		System.out.println(login.GetCurrentUrl());
		
		
		
		
		
		
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		BrowserFactory.closeBrowser(driver);
	}

}
