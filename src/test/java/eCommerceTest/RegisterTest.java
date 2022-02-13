package eCommerceTest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

	public String gmailGenerator () {
		return "xyz+" + Math.random() * 100000 + "@gmail.com";
	}

	
	// check register with valid creds of new user 
	@Test
	public void verifyRegisterNewUser() {

		// Head to Home screen
		homePage.clickOn_signIn_btn();
		// waitTillElementAppear(authPage.getCreateAnAccount_btn());
		// Head to login/SignUp screen
		authPage.setSignUp_email(gmailGenerator());
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

	
	// check that password is required 
	@Test
	public void verifyRegisterWithoutPassword() {

		// Head to Home screen
		homePage.clickOn_signIn_btn();
		// waitTillElementAppear(authPage.getCreateAnAccount_btn());
		// Head to login/SignUp screen
		authPage.setSignUp_email(gmailGenerator());
		authPage.clickOn_createAccount_btn();

		// Head to Registration screen
		waitTillElementAppear(registerPage.getFirst_name());
		registerPage.set_firstName("ahmed");
		registerPage.set_lastName("ali");
		// registerPage.set_password("12345");
		registerPage.set_address("egypt");
		registerPage.set_city("cairo alex");
		registerPage.set_state(5);
		registerPage.set_postalCode("95625");
		registerPage.set_phoneNum("953621451");
		registerPage.clickOn_register_btn();
		boolean errorsAlertIsDisplayed = registerPage.getErrorsAlert().isDisplayed();
		assertTrue(errorsAlertIsDisplayed);
	}
	
	
	

}
