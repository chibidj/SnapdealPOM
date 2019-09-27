package org.pom.snapdeal.SnapPom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static void loadUrl(String a){
	System.setProperty("webdriver.chrome.driver", "C:\\cb\\SnapdealPOM\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(a);
}
	
	public static void click(WebElement a){
		a.click();
	}
	
	public static void send(WebElement a, String b){
		a.sendKeys(b);
	}
	
	public static String ExcelRead(int a, int b) throws IOException {
		File f = new File("C:\\cb\\SnapdealPOM\\Excel\\cbSnapdeal.xlsx");
		FileInputStream is = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(is);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(a);
		Cell c = r.getCell(b);
		int i = c.getCellType();
		String cellvalue = null;
		if(i==1) {
			cellvalue = c.getStringCellValue();
			}
		else {
			if(DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yy");
				cellvalue = df.format(d);
			}
			else {
				double di = c.getNumericCellValue();
				long lo = (long) di;
				cellvalue = String.valueOf(lo);
			}
		}
		return cellvalue;
		
		
	}
}
