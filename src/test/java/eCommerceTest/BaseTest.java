package eCommerceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import ecommercePages.AuthenticationPage;
import ecommercePages.ProductsPage;
import ecommercePages.CheckOutStepsPage;
import ecommercePages.HomePage;
import ecommercePages.MyAccountPage;
import ecommercePages.OrderHistoryPage;
import ecommercePages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static String url = "http://automationpractice.com/index.php";
	HomePage homePage;
	AuthenticationPage authPage;
	RegisterPage registerPage;
	MyAccountPage myAccount;
	ProductsPage blousePage;
	CheckOutStepsPage stepsPage;
	OrderHistoryPage orderPage;

	// wait until the element to appear

	public void waitTillElementAppear(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// wait until the element to be clickable

	public void waitTillElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	// Hover on the element

	public void hoverOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	@BeforeMethod
	public void openURL() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		authPage = new AuthenticationPage(driver);
		registerPage = new RegisterPage(driver);
		myAccount = new MyAccountPage(driver);
		blousePage = new ProductsPage(driver);
		stepsPage = new CheckOutStepsPage(driver);
		orderPage = new OrderHistoryPage(driver);
		driver.get(url);
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}

}
