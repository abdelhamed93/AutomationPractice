package ecommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	// Page Locators

	@FindBy(xpath = "//div[@id='block_top_menu']//a[@title='Women']")
	private WebElement women_btn;

	@FindBy(xpath = "//div[@id='block_top_menu']//a[@title='Blouses']")
	private WebElement blouses_btn;

	@FindBy(xpath = "//h1[contains(text(),'My account')]")
	private WebElement myAccount_header;

	// Page Actions

	public WebElement getMyAccount_header() {
		return myAccount_header;
	}

	public void setMyAccount_header(WebElement myAccount_header) {
		this.myAccount_header = myAccount_header;
	}

	public void hoverOn_women_btn() {
		hoverOnElement(women_btn);
	}

	public WebElement getWomen_btn() {
		return women_btn;
	}

	public void setWomen_btn(WebElement women_btn) {
		this.women_btn = women_btn;
	}

	public WebElement getBlouses_btn() {
		return blouses_btn;
	}

	public void setBlouses_btn(WebElement blouses_btn) {
		this.blouses_btn = blouses_btn;
	}

	public void clickOn_blouses_btn() {
		blouses_btn.click();

	}

}
