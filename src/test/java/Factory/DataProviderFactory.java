package Factory;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class DataProviderFactory {
	
	public static ConfigDataProvider getConfig()
	{
		ConfigDataProvider Con = new ConfigDataProvider(); 
		return Con; 
	}
	
	public static ExcelDataProvider getExcel()
	{
			ExcelDataProvider excel = new ExcelDataProvider(); 
			return excel; 
	}
	

}
