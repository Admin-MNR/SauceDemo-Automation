package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.*;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	
	
	public static Object[][] getExcelData(String filepath, String sheetName) throws Exception
	{
		File excelfile=new File(filepath);
		FileInputStream fis=new FileInputStream(excelfile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		
		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getLastCellNum();
		
		DataFormatter formatter = new DataFormatter();
		Object[][] data=new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				data[i - 1][j]=formatter.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		
		workbook.close();
	    fis.close();
	    return data;
	}

}
