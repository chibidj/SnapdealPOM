package org.pom.snapdeal.SnapPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	
	public class PurchasePage extends BaseClass {
		public PurchasePage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//div[@id=\"buy-button-id\"]")
		private WebElement btnBuy;

		public WebElement getBtnBuy() {
			return btnBuy;
		}
		


}
