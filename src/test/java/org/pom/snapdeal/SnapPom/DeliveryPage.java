package org.pom.snapdeal.SnapPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage extends BaseClass {
	public DeliveryPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='zip']")
	private WebElement txtPinCode;
	
	@FindBy(xpath="//input[@id='fullName']")
	private WebElement txtName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement txtAddress;
	
	@FindBy(xpath="//input[@id='nearestLandmark']")
	private WebElement txtLandmark;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement txtCity;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement txtState;
	
	@FindBy(xpath="(//span[@class='circle'])[1]")
	private WebElement btnHomeAddress;
	
	@FindBy(xpath="//button[@id='delivery-modes-continue']")
	private WebElement btnSave; 
	
	@FindBy(xpath="//div[@data-index='0']")
	private WebElement btnDelivery;
	
	@FindBy(xpath="//button[@id='make-payment']")
	private WebElement btnProceed;

	public WebElement getTxtPinCode() {
		return txtPinCode;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtLandmark() {
		return txtLandmark;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getBtnHomeAddress() {
		return btnHomeAddress;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	public WebElement getBtnDelivery() {
		return btnDelivery;
	}

	public WebElement getBtnProceed() {
		return btnProceed;
	} 	
	

}
