package ecommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends BasePage {

	public OrderHistoryPage(WebDriver driver) {
		super(driver);
	}

	// Page Locators

	@FindBy(xpath = "//th[text()='Order reference']")
	private WebElement orderReference;

	// Page Actions

	public WebElement getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(WebElement orderReference) {
		this.orderReference = orderReference;
	}

}
