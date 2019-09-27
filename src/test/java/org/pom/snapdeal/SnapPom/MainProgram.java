package org.pom.snapdeal.SnapPom;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class MainProgram extends BaseClass{
	public static void main(String[] args) throws InterruptedException, IOException {
		loadUrl("https://www.snapdeal.com");
		
		LoginPage lp = new LoginPage();
		//Login
		click(lp.getLoginDrop());
		//enter the frame
		click(lp.getLogin());
		driver.switchTo().frame(lp.getLogFrame());
		Thread.sleep(5000);
		send(lp.getUserName(),ExcelRead(0, 0));
		click(lp.getBtnContinue());
		Thread.sleep(2000);
		send(lp.getPassWord(),ExcelRead(0, 1));
		click(lp.getKeepSign());
		click(lp.getSubmit());
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		OrderPage op = new OrderPage();
		send(op.getSearchBar(),ExcelRead(0, 2));
		click(op.getBtnSearch());
		String pWindow = driver.getWindowHandle();
		click(op.getSelectGlass());
		
		
		Set<String> setWindows = driver.getWindowHandles();
		for(String x:setWindows) {
			if(!pWindow.equals(x)) {
				driver.switchTo().window(x);
			}
			
		}
		
		PurchasePage pp = new PurchasePage();
		click(pp.getBtnBuy());
		
		DeliveryPage dp = new DeliveryPage();
		send(dp.getTxtPinCode(), ExcelRead(0, 3));
		send(dp.getTxtName(), ExcelRead(0, 4));
		send(dp.getTxtAddress(), ExcelRead(0, 5));
		send(dp.getTxtLandmark(), ExcelRead(0, 6));
		//send(dp.getTxtCity(), "Chennai");
		//send(dp.getTxtState(), "TamilNadu");
		click(dp.getBtnHomeAddress());
		click(dp.getBtnSave());
		Thread.sleep(2000);
		click(dp.getBtnProceed());
	}	

}
