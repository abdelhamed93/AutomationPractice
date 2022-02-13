package ecommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	// Page Locators

	@FindBy(className = "login")
	private WebElement signIn_btn;

	// Page Actions

	public WebElement getSignIn_btn() {
		return signIn_btn;
	}

	public void setSignIn_btn(WebElement signIn_btn) {
		this.signIn_btn = signIn_btn;
	}

	public void clickOn_signIn_btn() {
		clickOnElement(signIn_btn);

	}

}
