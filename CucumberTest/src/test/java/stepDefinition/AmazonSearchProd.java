package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import pageObejcts.AmazonSearch;

public class AmazonSearchProd {
	
	WebDriver driver=null;
	//@Before(value = "@SmokeTest",order =0)
	@Before
	public void BrowserSetup() {
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		as= new AmazonSearch(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
//	@Before(order = 1)
//	public void BrowserSetup2() {
//		String ProjectPath=System.getProperty("user.dir");
//		System.setProperty("webdriver.Edge.driver",ProjectPath+"/src/test/resources/Drivers/msedgedriver.exe" );
//		driver=new EdgeDriver();
//		as= new AmazonSearch(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
	
	@After
	public void TearDown() {
		System.out.println("Chrome Browser is getting closed");
		//driver.close();
		driver.quit();
	}
//	
//	@After(order = 0)
//	public void TearDown2() {
//		System.out.println("Edge Browser is getting closed");
//		//driver.close();
//		driver.quit();
//	}
	
	
	@BeforeStep
	public void BeforeStep() {
		System.out.println(" I am before step");
	}
	
	@AfterStep
	public void AfterStep() {
		System.out.println(" I am after step");
	}
	
	public AmazonSearch as;
	@Given("browser is open")
	public void browser_is_open() {
	System.out.println("Browser is open");
	}

	@Given("user navigates to {string}")
	public void user_navigates_to(String URL) {
		driver.get(URL);
	}

	@When("user enter {string} is search bar")
	public void user_enter_is_search_bar(String ProdName) {
		as.EnterText(ProdName);
		
	}

	@When("hits enter")
	public void hits_enter() {
		as.ClickSearch();
	}

	@Then("user navigates to search result")
	public void user_navigates_to_search_result() throws InterruptedException {
		//Amazon.in : apple
		Thread.sleep(60);
	}



}
