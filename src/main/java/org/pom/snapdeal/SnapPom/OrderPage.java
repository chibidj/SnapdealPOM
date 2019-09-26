package org.pom.snapdeal.SnapPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BaseClass{

		public OrderPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id="inputValEnter")
		private WebElement searchBar;
		
		@FindBy(xpath="//button[@class='searchformButton col-xs-4 rippleGrey']")
		private WebElement btnSearch;
		
		@FindBy(xpath="//p[@title='Louis Vuitton - Blue Wayfarer Sunglasses']")
		private WebElement selectGlass;

		public WebElement getSearchBar() {
			return searchBar;
		}

		public WebElement getBtnSearch() {
			return btnSearch;
		}

		public WebElement getSelectGlass() {
			return selectGlass;
		}
		
		

}
