package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObejcts.LoginPage;

public class LoginDemo {

	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch the browser")
	public void user_launch_the_browser() {
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user opens URL {string}")
	public void user_opens_url(String URL) {
		driver.get(URL);
	}

	@When("User enters the Email as {string} and Password as {string}")
	public void user_enters_the_email_as_and_password_as(String Email, String Password) {
		lp.SetEmail(Email);
		lp.SetPassword(Password);
	}

	@When("click on login")
	public void click_on_login() {
		lp.ClickLogin();
	}

	@Then("user navigates to shopping cart page")
	public void user_navigates_to_shopping_cart_page() {
		lp.ClickLogout();
		
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}
	
}
