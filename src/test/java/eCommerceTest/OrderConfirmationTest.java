package eCommerceTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class OrderConfirmationTest extends BaseTest {

	public String expectedOrderConfirmationMsg = "ORDER CONFIRMATION";
// check the confirmation Msg when ordering item
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

}
