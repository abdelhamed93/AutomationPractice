package ecommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	// Page Locators

	@FindBy(xpath = "//div[@class='left-block']")
	private WebElement blouses_image;

	@FindBy(xpath = "//a[@class='product-name'][@title='Blouse']")
	private WebElement blouseProductText;

	@FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
	private WebElement tShirtProductText;

	@FindBy(xpath = "//i[@class='icon-ok']")
	private WebElement tickMark;

	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	private WebElement addToCart_btn;

	@FindBy(xpath = "//div/a[@title='Proceed to checkout']")
	private WebElement proceed_btn;

	// Page Actions

	public WebElement getTickMark() {
		return tickMark;
	}

	public void setTickMark(WebElement tickMark) {
		this.tickMark = tickMark;
	}

	public WebElement getBlouseProductText() {
		return blouseProductText;
	}

	public void setBlouseProductText(WebElement blouseProductText) {
		this.blouseProductText = blouseProductText;
	}

	public WebElement getProceed_btn() {
		return proceed_btn;
	}

	public void setProceed_btn(WebElement proceed_btn) {
		this.proceed_btn = proceed_btn;
	}

	public WebElement getBlouses_image() {
		return blouses_image;
	}

	public void setBlouses_image(WebElement blouses_image) {
		this.blouses_image = blouses_image;
	}

	public WebElement getAddToCart_btn() {
		return addToCart_btn;
	}

	public void setAddToCart_btn(WebElement addToCart_btn) {
		this.addToCart_btn = addToCart_btn;
	}

	public void clickOnAddToCartBtn() {
		addToCart_btn.click();
	}

	public void clickOnProceedBtn() {
		proceed_btn.click();
	}

}
