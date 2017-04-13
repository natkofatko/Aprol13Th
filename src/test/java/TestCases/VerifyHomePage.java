package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.HomePage;
import Pages.LoginPage;

public class VerifyHomePage {
	
	WebDriver driver; 
	HomePage home; 
	LoginPage login;
	ExtentReports report;
	ExtentTest logger; 
	@BeforeMethod
	public void SetUpEverything()
	{
	report = new ExtentReports("C:\\Users\\natal\\workspace\\LearnAutomation\\com.April13thHybridFramework\\Reports\\LoginPageReport.html", true);	
	logger = report.startTest("TestWithExtentReport"); 
	driver = BrowserFactory.getBrowser("chrome"); 
	logger.log(LogStatus.INFO, "Open Browser");
	driver.get(DataProviderFactory.getConfig().GetUrlAdress());
	logger.log(LogStatus.INFO, "Get Browser Url");
	home = PageFactory.initElements(driver, HomePage.class); 
	login = PageFactory.initElements(driver, LoginPage.class); 
	 
	}
	
	@Test
	public void TestCase02()
	{
		
		
		System.out.println(home.getTitle());
		logger.log(LogStatus.PASS, "Title Verified");
		home.ClickOnMyAccountLink();
		logger.log(LogStatus.PASS, "Click on my account");
		home.clickOnMyPageLink();
		logger.log(LogStatus.PASS, "Click on my page link");
		home.ClickOnCartLink();
		logger.log(LogStatus.PASS, "Click on cart link");
		home.ClickOnSignLoink();
		logger.log(LogStatus.PASS, "Click on sign link");
		home.clickOnMyPageLink();	
		logger.log(LogStatus.PASS, "Click on my pages");
		home.ClickOnSignLoink();
		logger.log(LogStatus.PASS, "Click on sign link");
		
		
		
	}
		@Test
		public void TestCase2() throws InterruptedException
		{
			home.ClickOnMyAccountLink();
			logger.log(LogStatus.PASS, "Click on my account");
			Thread.sleep(2000);
			login.LogInToMyAccount(DataProviderFactory.getExcel().getDataFromeExcel2(0, 0, 0), 
					DataProviderFactory.getExcel().getDataFromeExcel2(0, 0, 1));
			logger.log(LogStatus.PASS, "Login succesful");
		}
//		@Test
//		public void TestCase3()
//		{
//			home.ClickOnMyAccountLink();
//	
//		login.LogInToMyAccount(DataProviderFactory.getExcel().getDataFromeExcel2(0, 1, 0), 
//				DataProviderFactory.getExcel().getDataFromeExcel2(0, 1, 1));
//		
//		
//		}
//		@Test
//		public void TestCase4()
//		{
//			home.ClickOnMyAccountLink();login.LogInToMyAccount(DataProviderFactory.getExcel().getDataFromeExcel2(0, 2, 0), 
//				DataProviderFactory.getExcel().getDataFromeExcel2(0, 2, 1));
//		}
//	
//		@Test
//		public void TestCase5()
//		{
//			home.ClickOnMyAccountLink();login.LogInToMyAccount(DataProviderFactory.getExcel().getDataFromeExcel2(0, 3, 0), 
//				DataProviderFactory.getExcel().getDataFromeExcel2(0, 3, 1));
//		}
//			
			@AfterMethod
	public void TearDown()
	{
		BrowserFactory.closeBrowser(driver);
		report.endTest(logger);
		report.flush();
		report.close();
	}

}
