package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage_PF {
	
	// Find element by using some of the text it displays
	@FindBy(partialLinkText = "Open")
	WebElement burgerMenuBtn;
	
	@FindBy(id = "logout_sidebar_link")
	WebElement logoutLink;
	
	// Find an element using the link text
	@FindBy(linkText = "LinkedIn")
	WebElement linkedInLink;
	
	@FindBy(how = How.CLASS_NAME, using = "product_sort_container")
	WebElement sortList;
	Select dropdown = new Select(sortList);
	
	// Find a link WebElement that may not have an id or link text
	@FindBy(how = How.CLASS_NAME, using = "shopping_cart_link")
	WebElement shoppingCart;
	
	WebDriver driver;
	
	// Constuctor
	public InventoryPage_PF(WebDriver driver) {
		this.driver = driver;
		// Must initialize the WebElements in this class
		// AjaxElementLocatorFactory adds a timeout for a web element -
		// it will wait for 30 seconds until the annotated web element is loaded
		PageFactory.initElements(
				new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public void checkBurgerBtnIsDisplayed() {
		burgerMenuBtn.isDisplayed();
	}
	
	public void selectPriceLowHigh() {
		dropdown.selectByVisibleText("Price (low to high)");
	}
}
