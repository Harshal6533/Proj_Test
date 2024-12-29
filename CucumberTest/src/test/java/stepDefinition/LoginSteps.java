package stepDefinition;

import io.cucumber.java.en.*;

public class LoginSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("First step: user is on login page");
	}

	@When("user enters UserName and Password")
	public void user_enters_user_name_and_password() {
		System.out.println("Second step: user enetered the username & password");
	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println("Third step: user clicked on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Fourth step: user is on home page");
	}




}
