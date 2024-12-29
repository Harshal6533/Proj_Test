package pageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearch {
	
	public WebDriver ldriver;

	public AmazonSearch(WebDriver rdriver) {

		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement Search_Box;
	
	@FindBy(id="nav-search-submit-button")
	WebElement Search_btn;
	
	public void EnterText(String PName) {
		Search_Box.clear();
		Search_Box.sendKeys(PName);
	}
	
	public void ClickSearch() {
		Search_btn.click();
	}

}
