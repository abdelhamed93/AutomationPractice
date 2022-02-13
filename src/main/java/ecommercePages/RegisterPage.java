package ecommercePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);

	}
	// Page Locators

	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement first_name;

	@FindBy(id = "customer_lastname")
	private WebElement last_name;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "address1")
	private WebElement address;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "id_state")
	private WebElement state_ddl;

	@FindBy(id = "postcode")
	private WebElement postcode;

	@FindBy(id = "phone_mobile")
	private WebElement phone_mobile;

	@FindBy(id = "submitAccount")
	private WebElement register_btn;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement errorsAlert;

	// Page Actions

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public void setFirst_name(WebElement first_name) {
		this.first_name = first_name;
	}

	public WebElement getErrorsAlert() {
		return errorsAlert;
	}

	public void setErrorsAlert(WebElement errorsAlert) {
		this.errorsAlert = errorsAlert;
	}

	public void set_firstName(String value) {

		first_name.sendKeys(value);
	}

	public WebElement getLast_name() {
		return this.last_name;
	}

	public void setLast_name(WebElement last_name) {
		this.last_name = last_name;
	}

	public void set_lastName(String lastName) {
		setValue(last_name, lastName);
	}

	public void set_password(String password) {
		setValue(this.password, password);
	}

	public void set_address(String address) {
		setValue(this.address, address);
	}

	public void set_city(String city) {
		setValue(this.city, city);
	}

	public void set_state(int index) {
		selectElement(state_ddl, index);
	}

	public void set_postalCode(String postalCode) {
		setValue(this.postcode, postalCode);
	}

	public void set_phoneNum(String num) {
		setValue(phone_mobile, num);
	}

	public void clickOn_register_btn() {
		clickOnElement(register_btn);
	}

}
