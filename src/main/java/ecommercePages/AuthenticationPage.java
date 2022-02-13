package ecommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPage extends BasePage {

	public AuthenticationPage(WebDriver driver) {
		super(driver);

	}

	
	// Page Locators
	
	@FindBy(id = "email_create")
	private WebElement email_signUp;

	@FindBy(id = "SubmitCreate")
	private WebElement createAnAccount_btn;

	@FindBy(id = "email")
	private WebElement email_login;

	@FindBy(id = "passwd")
	private WebElement passwd_login;

	@FindBy(id = "SubmitLogin")
	private WebElement signIn_login_btn;

	@FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
	private WebElement invalidEmailMsg;
	
	// Page Actions

	public WebElement getInvalidEmailMsg() {
		return invalidEmailMsg;
	}

	public void setInvalidEmailMsg(WebElement invalidEmailMsg) {
		this.invalidEmailMsg = invalidEmailMsg;
	}

	public WebElement getEmail_create() {
		return email_signUp;
	}

	public void setEmail_create(WebElement email_create) {
		this.email_signUp = email_create;
	}

	public WebElement getPasswd_login() {
		return passwd_login;
	}

	public void setPasswd_login(WebElement passwd_login) {
		this.passwd_login = passwd_login;
	}

	public WebElement getSignIn_btn() {
		return signIn_login_btn;
	}

	public void setSignIn_btn(WebElement signIn_btn) {
		this.signIn_login_btn = signIn_btn;
	}

	public WebElement getEmail_login() {
		return email_login;
	}

	public WebElement getEmail_address() {
		return email_signUp;
	}

	public void setEmail_address(WebElement email_address) {
		this.email_signUp = email_address;
	}

	public WebElement getCreateAnAccount_btn() {
		return createAnAccount_btn;
	}

	public void setCreateAnAccount_btn(WebElement createAnAccount_btn) {
		this.createAnAccount_btn = createAnAccount_btn;
	}

	public void setSignUp_email(String email) {

		setValue(email_signUp, email);
	}

	public void clickOn_createAccount_btn() {
		clickOnElement(createAnAccount_btn);
	}

	public void setLogin_email(String email) {
		setValue(email_login, email);

	}

	public void setLogin_password(String passwd) {

		setValue(passwd_login, passwd);
	}

	public void clickOn_signIn_login_btn() {
		clickOnElement(signIn_login_btn);
	}



}
