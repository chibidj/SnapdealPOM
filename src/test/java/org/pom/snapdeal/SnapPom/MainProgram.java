package org.pom.snapdeal.SnapPom;

import org.openqa.selenium.interactions.Actions;


public class MainProgram extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		loadUrl("https://www.snapdeal.com");
		
		LoginPage lp = new LoginPage();
		//Login
		click(lp.getLoginDrop());
		//enter the frame
		click(lp.getLogin());
		driver.switchTo().frame(lp.getLogFrame());
		Thread.sleep(5000);
		send(lp.getUserName(),"9488866698");
		click(lp.getBtnContinue());
		Thread.sleep(5000);
		send(lp.getPassWord(),"Chibidj123");
		click(lp.getKeepSign());
		click(lp.getSubmit());
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		OrderPage op = new OrderPage();
		send(op.getSearchBar(),"louis vuitton glasses for men");
		click(op.getBtnSearch());
		click(op.getSelectGlass());
	}	

}
