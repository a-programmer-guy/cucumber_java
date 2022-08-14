package steps_for_hooks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	// @Before annotation means this function will occur before each scenario in the test
	@Before(order = 1)
	public void browserSetup() {
		System.out.println(">>> Browser Setup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	// To use a tag along with an order, you must add value= to the hook
	// This function will occur BEFORE browserSetup due to order number conditional (order = 0)
	// Adding the smoke tag will make this function only run with the scenerios that have the -  
	// @smoke tag in the .feature file. 
	@Before(value="@smoke", order = 0)
	public void browserSetup2() {
		System.out.println(">>> Browser Setup #2  occuring before Browser setup \n");
	}
	// @After annotation means it will occur after each scenario in the test
	@After 
	public void teardown() {
		System.out.println(">>> Browser Teardown");
		driver.close();
		driver.quit();
	}
	// BeforeStep and AfterStep will happen before and after each step of the test
	@BeforeStep
	public void beforeStep() {
		System.out.println(">>> BeforeStep annotation");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println(">>> AfterStep annotaion");
	}
	
	@Given("user is on login page hooks")
	public void user_is_on_login_page_hooks() {
	}
	@When("users enters valid standard_user and secret_sauce")
	public void users_enters_valid_standard_user_and_secret_sauce() {
	}
	@And("clicks the login button")
	public void clicks_the_login_button() {
	}
	@Then("user is navigated to the inventory page")
	public void user_is_navigated_to_the_inventory_page() {
	}
}
