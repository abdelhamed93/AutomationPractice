package eCommerceTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SelectProductTest extends BaseTest {

	public String expectedBlouseProduct = "Blouse";
	
	// check selecting a product

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

	
	// check product is selected successfully 
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
}
