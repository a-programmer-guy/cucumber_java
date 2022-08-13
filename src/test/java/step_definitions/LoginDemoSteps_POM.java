//package step_definitions;
//
//import java.time.Duration;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.LoginPage;
//
//public class LoginDemoSteps_POM {
//	
//	public static WebDriver driver;
//	public static String url = "https://www.saucedemo.com";
//	
//	// Instantiate LoginPage object at global level and pass the WebDriver into it
//	LoginPage loginPage;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("... Using LoginDemoSteps_POM ...");
//		System.out.println(" Inside step: browser is open");
//		// Use WebDriverManager to set up chrome driver
//		 WebDriverManager.chromedriver().setup();
//		 driver = new ChromeDriver();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		System.out.println("Inside step: user is on login page");
//		driver.get(url);
//		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
//	}
//	
//	/*
//	 * Use regular expressions for matching all to replace username and password
//	 * fields - when getting the information from the data tables in the -
//	 * logindemo.feature file - add the hat at the beginning and dollar sign to the -
//	 * end of the annotation string. Pass in the username and password to the method.
//	 * Instantiate a new instance of the LoginPage object and pass the driver to it to access
//	 * the methods that have been defined in the LoginPage class.
//	 */
//	
//	@When("^user enters (.*)and (.*)$")
//	public void user_enters_username_and_password(String userName, String password) throws InterruptedException {
//		System.out.println("Inside step: user enters username and password");
//		/*
//		 * By creating the LoginPage class as part of the POM architecture the previous lines
//		 * of code can be removed and replaced with the methods from the LoginPage Class
//		 */
//		loginPage = new LoginPage(driver);
//		loginPage.enterUserName(userName);
//		loginPage.enterPassword(password);
//	}
//
//	@And("clicks login button")
//	public void clicks_login_button() {
//		System.out.println("Inside step: clicks login button");
//		loginPage.clickLogin();
//	}
//
//	@Then("user is redirected to inventory page")
//	public void user_is_redirected_to_inventory_page() {
//		
//		System.out.println("Inside step: user is redirected to inventory page");
//		String expectedUrl = "https://www.saucedemo.com/inventory.html";
//		String actualUrl = driver.getCurrentUrl();
//		System.out.println("Expected Url after login is " + expectedUrl +
//				" And the actual Url after login is " + actualUrl);
//		driver.close();
//		driver.quit();
//	}
//
//}
