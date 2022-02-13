package ecommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutStepsPage extends BasePage {

	public CheckOutStepsPage(WebDriver driver) {
		super(driver);
	}

	// Page Locators

	@FindBy(xpath = "//p/a[@title='Proceed to checkout']")
	private WebElement proceedBtn2;

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement proceedBtn3;

	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement proceedBtn4;

	@FindBy(id = "cgv")
	private WebElement terms;

	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement payBybankWire_btn;

	@FindBy(xpath = "//a[@title=\"Pay by check.\"]")
	private WebElement payByCheck_btn;

	@FindBy(xpath = "//h3[contains(text(),'Bank-wire payment.')]")
	private WebElement bankWirePayment;

	@FindBy(xpath = "//h1[contains(text(),'Order confirmation')]")
	private WebElement confirmationMsg;

	@FindBy(xpath = "//h3[contains(text(),'Check payment')]")
	private WebElement checkPaymentText;

	@FindBy(xpath = "//p[@id='cart_navigation']//button[@type='submit']")
	private WebElement confirmOrder;

	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement backToOrders;

	@FindBy(xpath = "//span[contains(text(),'Your payment method')]")
	private WebElement paymentMethodsIcon;

	// Page Actions

	public WebElement getPaymentMethodsIcon() {
		return paymentMethodsIcon;
	}

	public WebElement getCheckPaymentText() {
		return checkPaymentText;
	}

	public void setCheckPaymentText(WebElement checkPaymentText) {
		this.checkPaymentText = checkPaymentText;
	}

	public WebElement getConfirmationMsg() {
		return confirmationMsg;
	}

	public void setConfirmationMsg(WebElement confirmationMsg) {
		this.confirmationMsg = confirmationMsg;
	}

	public WebElement getBankWirePayment() {
		return bankWirePayment;
	}

	public void setBankWirePayment(WebElement bankWirePayment) {
		this.bankWirePayment = bankWirePayment;
	}

	public void setPaymentMethodsIcon(WebElement paymentMethodsIcon) {
		this.paymentMethodsIcon = paymentMethodsIcon;
	}

	public void clickOnPro2() {

		proceedBtn2.click();
	}

	public void clickOnPro3() {

		proceedBtn3.click();
	}

	public void clickOnPro4() {

		proceedBtn4.click();
	}

	public void clickOnTerms() {

		terms.click();
	}

	public void clickOnBankWire() {

		payBybankWire_btn.click();
	}

	public void clickOnCheckBtn() {

		payByCheck_btn.click();
	}

	public void clickOnconfirmOrder() {

		confirmOrder.click();
	}

	public void clickOnBackToOrders() {

		backToOrders.click();
	}

	public WebElement getProceedBtn2() {
		return proceedBtn2;
	}

	public void setProceedBtn2(WebElement proceedBtn2) {
		this.proceedBtn2 = proceedBtn2;
	}

	public WebElement getProceedBtn3() {
		return proceedBtn3;
	}

	public void setProceedBtn3(WebElement proceedBtn3) {
		this.proceedBtn3 = proceedBtn3;
	}

	public WebElement getProceedBtn4() {
		return proceedBtn4;
	}

	public void setProceedBtn4(WebElement proceedBtn4) {
		this.proceedBtn4 = proceedBtn4;
	}

	public WebElement getTerms() {
		return terms;
	}

	public void setTerms(WebElement terms) {
		this.terms = terms;
	}

	public WebElement getBankWire() {
		return payBybankWire_btn;
	}

	public void setBankWire(WebElement bankWire) {
		this.payBybankWire_btn = bankWire;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public void setConfirmOrder(WebElement confirmOrder) {
		this.confirmOrder = confirmOrder;
	}

	public WebElement getBackToOrders() {
		return backToOrders;
	}

	public void setBackToOrders(WebElement backToOrders) {
		this.backToOrders = backToOrders;
	}
}
