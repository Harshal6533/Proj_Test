package pageObejcts;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.gl.Logo;

public class LoginPage {
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id="email")
	@CacheLookup
	WebElement Email_login;

	@FindBy(id="password")
	@CacheLookup
	WebElement password_login;

	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement Login_btn;

	@FindBy(xpath="//a[@id='logout']")
	@CacheLookup
	WebElement Logout_btn;
	
	public void SetEmail(String ema) {
		Email_login.clear();
		Email_login.sendKeys(ema);
	}
	
	public void SetPassword(String pwd) {
		password_login.clear();
		password_login.sendKeys(pwd);
	}
	
	public void ClickLogin() {
		Login_btn.click();
	}

	public void ClickLogout() {
		Logout_btn.click();
	}
	
	

}
