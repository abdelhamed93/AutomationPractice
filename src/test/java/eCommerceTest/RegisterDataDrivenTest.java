package eCommerceTest;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.DataGenerate;

public class RegisterDataDrivenTest extends BaseTest {
	
	// Register by Data provider.

	@Test(dataProvider = "test_data")
	public void verifyRegisterNewUser(String email, String firstName, String lastName, String address, String city) throws InterruptedException {

		// Head to Home screen
		homePage.clickOn_signIn_btn();
		// Head to login/SignUp screen
		waitTillElementAppear(authPage.getCreateAnAccount_btn());
		authPage.setSignUp_email(email);
		authPage.clickOn_createAccount_btn();

		// Head to Registration screen
		waitTillElementAppear(registerPage.getFirst_name());
		registerPage.set_firstName(firstName);
		registerPage.set_lastName(lastName);
		registerPage.set_password("12345");
		registerPage.set_address(address);
		registerPage.set_city(city);
		registerPage.set_state(5);
		registerPage.set_postalCode("95625");
		registerPage.set_phoneNum("953621451");
		registerPage.clickOn_register_btn();
		boolean myAccountHeader = myAccount.getMyAccount_header().isDisplayed();
		assertTrue(myAccountHeader);
	}
	
	@DataProvider
	public String[][] test_data() throws IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		DataGenerate obj = new DataGenerate();
		return obj.read_excel();
	}
}
