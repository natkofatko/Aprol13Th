package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver , String ScreenName)
	{
	String destination = "C:\\Users\\natal\\workspace\\LearnAutomation\\com.April13thHybridFramework\\Screenshots\\" + ScreenName + System.currentTimeMillis() + ".png"; 
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(src, new File(destination));
	} catch (Exception e) {
			e.printStackTrace();
	}
	
	return destination; 
	}
	

}
