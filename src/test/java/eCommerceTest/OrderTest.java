package eCommerceTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.DataGenerate;

public class OrderTest extends BaseTest {

	public String gmailGenerator = "xyz+" + Math.random() * 100000 + "@gmail.com";
	public String actual_URL;
	public String expectedLogin_URL = "http://automationpractice.com/index.php?controller=my-account";
	public String expectedBlouseProduct = "Blouse";
	public String expectedBankWireMetod = "BANK-WIRE PAYMENT.";
	public String expectedOrderConfirmationMsg = "ORDER CONFIRMATION";

	
	  @Test(dataProvider = "test_data")
	  public void checkOrderItem(String email, String firstName, String lastName) throws InterruptedException
	  {
	  //waitTillElementAppear(homePage.getSignIn_btn());
	  // Head to Home screen 
	  homePage.clickOn_signIn_btn();
	  waitTillElementAppear(authPage.getCreateAnAccount_btn());
	  // Head to login/SignUp screen 
	  authPage.setSignUp_email(email);
	  authPage.clickOn_createAccount_btn();
	  
	  // Head to Registration screen
	  waitTillElementAppear(registerPage.getFirst_name());
	  registerPage.set_firstName(firstName);
	  registerPage.set_lastName(lastName);
	  registerPage.set_password("12365");
	  registerPage.set_address("rrrrr");
	  registerPage.set_city("rrrr");
	  registerPage.set_state(5);
	  registerPage.set_postalCode("12345");
	  registerPage.set_phoneNum("651254");
	  registerPage.clickOn_register_btn();
	  
	  // Head to MyAccount screen waitTillElementAppear(myAccount.getWomen_btn());
	  hoverOnElement(myAccount.getWomen_btn()); myAccount.clickOn_blouses_btn();
	  
	  // Head to BlouseProduct screen
	  waitTillElementAppear(blousePage.getBlouses_image());
	  hoverOnElement(blousePage.getBlouses_image());
	  blousePage.clickOnAddToCartBtn();
	  waitTillElementClickable(blousePage.getProceed_btn());
	  blousePage.clickOnProceedBtn();
	  
	  // Head to CheckoutSteps screen stepsPage.clickOnPro2();
	  stepsPage.clickOnPro3(); stepsPage.clickOnTerms(); stepsPage.clickOnPro4();
	  stepsPage.clickOnBankWire(); stepsPage.clickOnconfirmOrder();
	  stepsPage.clickOnBackToOrders();
	  
	  // Check that order is placed boolean orderReference =
	  orderPage.getOrderReference().isDisplayed();
	 // assertTrue(orderReference,"No orders are set");
	  
	  }
	 

	// Verify Authenticate by Valid Creds.
	@Test
	public void verifyLogInWithValidCreds() {

		// Head to Home screen
		homePage.clickOn_signIn_btn();
		waitTillElementAppear(authPage.getCreateAnAccount_btn());
		// Head to login/SignUp screen
		authPage.setLogin_email("xyz@gmail.com");
		authPage.setLogin_password("12345");
		authPage.clickOn_signIn_login_btn();
		actual_URL = driver.getCurrentUrl();
		assertEquals(actual_URL, expectedLogin_URL);

	}
	
	
	@Test
	public void verifyLogInByInValidEmail() {

		// Head to Home screen
		homePage.clickOn_signIn_btn();
		waitTillElementAppear(authPage.getCreateAnAccount_btn());
		// Head to login/SignUp screen
		authPage.setLogin_email("uuuuuuu");
		authPage.setLogin_password("12345");
		authPage.clickOn_signIn_login_btn();
		String invalidEmailMsg = authPage.getInvalidEmailMsg().getText();
		assertEquals(invalidEmailMsg, "hhhhhhhhhh", "ooooooo");
		

	}

	@Test
	public void verifyRegisterNewUser() {

		// Head to Home screen
		homePage.clickOn_signIn_btn();
		// waitTillElementAppear(authPage.getCreateAnAccount_btn());
		// Head to login/SignUp screen
		authPage.setSignUp_email(gmailGenerator);
		authPage.clickOn_createAccount_btn();

		// Head to Registration screen
		waitTillElementAppear(registerPage.getFirst_name());
		registerPage.set_firstName("ahmed");
		registerPage.set_lastName("ali");
		registerPage.set_password("12345");
		registerPage.set_address("egypt");
		registerPage.set_city("cairo alex");
		registerPage.set_state(5);
		registerPage.set_postalCode("95625");
		registerPage.set_phoneNum("953621451");
		registerPage.clickOn_register_btn();
		boolean myAccountHeader = myAccount.getMyAccount_header().isDisplayed();
		assertTrue(myAccountHeader);

	}

	@Test
	public void verifySelectBlouseProduct() {

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
		String ProductName = blousePage.getBlouseProductText().getText();
		assertEquals(ProductName, expectedBlouseProduct);

	}

	@Test
	public void VerifyResultedProductisSelected() {
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
		boolean tickMarkIsAppeared = blousePage.getTickMark().isDisplayed();

		assertTrue(tickMarkIsAppeared, "Item is Not Selected");

	}

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
		assertEquals(bankWirepaymentMethod, expectedBankWireMetod, "Bank Wire Method is Not Selected");

	}

	@Test
	public void VeifyOrderConfirmationMsg() {
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
		stepsPage.clickOnconfirmOrder();
		String confirmMsg = stepsPage.getConfirmationMsg().getText();
		assertEquals(confirmMsg, expectedOrderConfirmationMsg, "Invalid Msg Format");

	}

	@Test
	public void VerifyOrderIsPlaced() {
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
		stepsPage.clickOnconfirmOrder();

		stepsPage.clickOnBackToOrders();

		// Check that order is placed
		boolean orderReference = orderPage.getOrderReference().isDisplayed();
		assertTrue(orderReference, "No orders are set");

	}

	@DataProvider
	public String[][] test_data() throws IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		DataGenerate obj = new DataGenerate();
		return obj.read_excel();
	}

}
