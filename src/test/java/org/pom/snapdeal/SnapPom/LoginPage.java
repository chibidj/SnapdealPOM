package org.pom.snapdeal.SnapPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='accountInner']")
	private WebElement loginDrop;
	
	@FindBy(xpath="//span[@class='accountBtn btn rippleWhite']")
	private WebElement login;
	
	@FindBy(xpath ="//iframe[@id='loginIframe']")
	private WebElement logFrame;
	
	@FindBy(id="userName")
	private WebElement userName;
	
	@FindBy(id="checkUser")
	private WebElement btnContinue;
	
	@FindBy(id="j_password_login_uc")
	private WebElement passWord;
	
	@FindBy(xpath="//label[@for='keepLoginUC']")
	private WebElement keepSign;
	
	@FindBy(id="submitLoginUC")
	private WebElement submit;

	public WebElement getLoginDrop() {
		return loginDrop;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLogFrame() {
		return logFrame;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getKeepSign() {
		return keepSign;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
