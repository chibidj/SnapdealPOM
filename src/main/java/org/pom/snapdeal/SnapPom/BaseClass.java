package org.pom.snapdeal.SnapPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static void loadUrl(String a){
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Anisha\\SnapPom\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(a);
}
	
	public static void click(WebElement a){
		a.click();
	}
	
	public static void send(WebElement a, String b){
		a.sendKeys(b);
	}
}
