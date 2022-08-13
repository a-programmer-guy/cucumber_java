//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
///*The LoginPage class identifies the WebElements present on the Login page 
//and the actions to be performed on the identified objects */
//
//public class LoginPage {
//	
//	WebDriver driver;
//
//	// Identify the WebElements on the page here and how to locate them
//	By userNameInput = By.id("user-name");
//	By passwordInput = By.id("password");
//	By loginBtn = By.xpath("//*[@id='login-button']");
//	
//	// Constructor with driver argument to be passed in
//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
//	
//	public void enterUserName(String userName) {
//		driver.findElement(userNameInput).sendKeys(userName);
//	}
//	
//	public void enterPassword(String password) {
//		driver.findElement(passwordInput).sendKeys(password);
//	}
//	
//	public void clickLogin() {
//		driver.findElement(loginBtn).click();
//	}
//	
//	// Method that includes all steps of the login process
//	public void loginValidUser(String userName, String password) {
//		driver.findElement(userNameInput).sendKeys(userName);
//		driver.findElement(passwordInput).sendKeys(password);
//		driver.findElement(loginBtn).click();
//	}
//}
