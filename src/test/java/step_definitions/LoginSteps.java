package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("a user is on the login page")
	public void a_user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Indside step - User is on the login page");
	}

	@When("the user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Indside step - user enters valid username and password");
	}

	@And("clicks the login button")
	public void clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Indside step - User clicks the login button");
	}

	@Then("user is redirected to the inventory page")
	public void user_is_navigated_to_the_inventory_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Indside step - User is redirected to the inventory page");

	}

}
