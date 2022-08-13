package step_definitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page_factory.InventoryPage_PF;
import page_factory.LoginPage_PF;

public class LoginDemoSteps_PF {
	
	public static WebDriver driver = null;
	public static String url = "https://www.saucedemo.com";
	LoginPage_PF login;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step: browser is open");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside step: user is on login page");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("^user enters (.*)and (.*)$")
	public void user_enters_username_and_password(String userName, String password) {
		System.out.println("Inside step: user enters username and password");
		// Create new instance of login page object
		login = new LoginPage_PF(driver);
		login.enterUserName(userName);
		login.enterPassword(password);
	}

	@And("clicks login button")
	public void clicks_login_button() throws InterruptedException {
		System.out.println("Inside step: clicks login button");
		login.clickLoginBtn();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-backpack")));
	}

	@Then("user is redirected to inventory page")
	public void user_is_redirected_to_inventory_page() {
		System.out.println("Inside step: user is redirected to inventory page");
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Expected Url after login is " + expectedUrl +
				" And the actual Url after login is " + actualUrl);
		driver.close();
		driver.quit();
	}

}
