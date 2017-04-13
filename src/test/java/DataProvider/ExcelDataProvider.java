package DataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb; 
	
	public ExcelDataProvider()
	{
		
		File src = new File("C:\\Users\\natal\\workspace\\LearnAutomation\\com.April13thHybridFramework\\ApplicationTest Data\\DataToLogIn.xlsx");
		
		try 
		{
			FileInputStream fis = new FileInputStream(src); 
		wb = new XSSFWorkbook(fis); 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public String GetDataFromExcel(String SheetName, int row, int cell)
	{
		String data = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue(); 
		return data; 
	}
	
	public String getDataFromeExcel2(int SheetNumber, int row , int cell )
	{
		String Data = wb.getSheetAt(SheetNumber).getRow(row).getCell(cell).getStringCellValue(); 
		return Data; 
	}
	
	
}
