package com.ExcelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void readExcel() throws  Exception{
	String ExcelPath="C:\\Users\\Shree\\eclipse-workspace nilesh\\MyProject\\TestData.xlsx";
	String FileName="TestData";
	String SheetName="Test";
	File file = new File(ExcelPath);
	FileInputStream Fis = new FileInputStream(file);
	XSSFWorkbook wb= new XSSFWorkbook(Fis);
	XSSFSheet sheet =wb.getSheet(SheetName);
	int rowCount=sheet.getLastRowNum();
	System.out.println("total rows" +rowCount);
	
	
	
	}
}
