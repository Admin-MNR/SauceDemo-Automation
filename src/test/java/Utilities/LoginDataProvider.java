package Utilities;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

	@DataProvider(name="LoginData")
	public Object[][] loginData() throws Exception
	{
		String path="C:\\Users\\DELL\\Desktop\\E_Commerce_Demo\\E_Commerce\\TestData\\LoginData.xlsx";
		String sheetName="Sheet1";
		
		return ExcelUtility.getExcelData(path, sheetName);
	}
	
//	@DataProvider(name="Info")
//	public Object[][] information() throws Exception
//	{
//		String path="C:\\Users\\DELL\\Desktop\\E_Commerce_Demo\\E_Commerce\\TestData\\Information.xlsx";
//		String sheetName="Sheet1";
//		
//		return ExcelUtility.getExcelData(path, sheetName);
//	}
}
