package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id = "user-name")
	WebElement userNameInput;
	
	@FindBy(id = "password")
	WebElement passwordInput;
	
	@FindBy(xpath = "//*[@id='login-button']")
	WebElement loginBtn;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		// Must initialize the WebElements in this class
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		userNameInput.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
//	public void redirectedToInventoryPage() throws InterruptedException {
//		Thread.sleep(20000);
//	}
}
