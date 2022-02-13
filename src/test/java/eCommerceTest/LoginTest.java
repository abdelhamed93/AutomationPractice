package eCommerceTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	public String actual_URL;
	public String expectedLogin_URL = "http://automationpractice.com/index.php?controller=my-account";

	
	// check login by valid creds
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

	
	
	// check entering invalid email
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
		assertEquals(invalidEmailMsg, "Invalid email address.", "Invalid Error Msg Format");

	}
}
