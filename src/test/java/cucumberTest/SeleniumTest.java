package cucumberTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	private static WebDriver driver;

	public static void main(String[] args) {
		
		// Create a new instance of the Chrome driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		// Put a Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception
//		new WebDriverWait(driver, Duration.ofSeconds(10));

		// Launch the website on the login page
		driver.get("https://demoqa.com/login");

		// Enter Username on the element found using id.
		driver.findElement(By.id("userName")).sendKeys("testuser_1");

		// Find the element that's ID attribute is 'password' and enter the password
		driver.findElement(By.id("password")).sendKeys("Test@123");

		// Now submit the form. WebDriver will find the form for us from the element
		driver.findElement(By.id("login")).click();

		// Print a Log In message to the screen
		System.out.println("Login Successfully");

		// Find the element by xpath for log out button and click
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

		// Print a Log In message to the screen
		System.out.println("LogOut Successfully");

		// Close the driver
		driver.quit();

	}
}
