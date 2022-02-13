package eCommerceTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest {
	public String expectedBankWireMethod = "BANK-WIRE PAYMENT.";
	public String expectedCheckMethod = "CHECK PAYMENT";
	
	
	// check following the checkout steps

	@Test
	public void VerifyFollowCheckoutProcedure() {
		// Head to Home screen
		homePage.clickOn_signIn_btn();
		waitTillElementAppear(authPage.getCreateAnAccount_btn());
		// Head to login/SignUp screen
		authPage.setLogin_email("xyz@gmail.com");
		authPage.setLogin_password("12345");
		authPage.clickOn_signIn_login_btn();
		waitTillElementAppear(myAccount.getWomen_btn());
		hoverOnElement(myAccount.getWomen_btn());
		myAccount.clickOn_blouses_btn();
		waitTillElementAppear(blousePage.getBlouses_image());
		hoverOnElement(blousePage.getBlouses_image());
		blousePage.clickOnAddToCartBtn();
		waitTillElementAppear(blousePage.getTickMark());

		blousePage.clickOnProceedBtn();

		// Head to CheckoutSteps screen
		stepsPage.clickOnPro2();
		stepsPage.clickOnPro3();
		stepsPage.clickOnTerms();
		stepsPage.clickOnPro4();

		boolean paymentMethodIconIsDisplayed = stepsPage.getPaymentMethodsIcon().isDisplayed();
		assertTrue(paymentMethodIconIsDisplayed, "Payment Method Icon is Not Displayed");

	}

	
	// check pay by bank wire method
	@Test
	public void VerifyBankWirePaymentIsSelected() {
		// Head to Home screen
		homePage.clickOn_signIn_btn();
		waitTillElementAppear(authPage.getCreateAnAccount_btn());
		// Head to login/SignUp screen
		authPage.setLogin_email("xyz@gmail.com");
		authPage.setLogin_password("12345");
		authPage.clickOn_signIn_login_btn();
		waitTillElementAppear(myAccount.getWomen_btn());
		hoverOnElement(myAccount.getWomen_btn());
		myAccount.clickOn_blouses_btn();
		waitTillElementAppear(blousePage.getBlouses_image());
		hoverOnElement(blousePage.getBlouses_image());
		blousePage.clickOnAddToCartBtn();
		waitTillElementAppear(blousePage.getTickMark());

		blousePage.clickOnProceedBtn();

		// Head to CheckoutSteps screen
		stepsPage.clickOnPro2();
		stepsPage.clickOnPro3();
		stepsPage.clickOnTerms();
		stepsPage.clickOnPro4();
		stepsPage.clickOnBankWire();

		String bankWirepaymentMethod = stepsPage.getBankWirePayment().getText();
		assertEquals(bankWirepaymentMethod, expectedBankWireMethod, "Bank Wire Method is Not Selected");

	}

	
	// check pay by the 'check' method

	@Test
	public void VerifyCheckPaymentIsSelected() {
		// Head to Home screen
		homePage.clickOn_signIn_btn();
		waitTillElementAppear(authPage.getCreateAnAccount_btn());
		// Head to login/SignUp screen
		authPage.setLogin_email("xyz@gmail.com");
		authPage.setLogin_password("12345");
		authPage.clickOn_signIn_login_btn();
		waitTillElementAppear(myAccount.getWomen_btn());
		hoverOnElement(myAccount.getWomen_btn());
		myAccount.clickOn_blouses_btn();
		waitTillElementAppear(blousePage.getBlouses_image());
		hoverOnElement(blousePage.getBlouses_image());
		blousePage.clickOnAddToCartBtn();
		waitTillElementAppear(blousePage.getTickMark());

		blousePage.clickOnProceedBtn();

		// Head to CheckoutSteps screen
		stepsPage.clickOnPro2();
		stepsPage.clickOnPro3();
		stepsPage.clickOnTerms();
		stepsPage.clickOnPro4();
		stepsPage.clickOnCheckBtn();

		String checkPaymentMethod = stepsPage.getCheckPaymentText().getText();
		assertEquals(checkPaymentMethod, expectedCheckMethod, "Check Method is Not Selected");

	}

}
