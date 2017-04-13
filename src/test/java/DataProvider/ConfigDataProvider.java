package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro; 
	
	public ConfigDataProvider() {
		File src = new File(
				"C:\\Users\\natal\\workspace\\LearnAutomation\\com.April13thHybridFramework\\Configuration\\Config.properties");

		try 
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		}
	public String GetUrlAdress()
	{
	String urlAdress = pro.getProperty("url");
	return urlAdress; 
	}
	
	public String getChromeDrive()
	{
		String chrome = pro.getProperty("chrome"); 
		return chrome; 
		
	}

	public String getEdgeDrive()
	{
		String edge = pro.getProperty("edge"); 
		return edge; 
		
	}
	public String getFirefoxDrive()
	{
		String firefox = pro.getProperty("firefox"); 
		return firefox; 
		
	}


}
