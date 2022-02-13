package ecommercePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	static WebDriver driver;

	

	/*
	 * public void set() { WebDriverManager.chromedriver().setup();
	 * 
	 * driver = new ChromeDriver(); }
	 */

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	protected static void setValue(WebElement element, String value) {

		element.sendKeys(value);

	}

	protected static void clickOnElement(WebElement element) {
		element.click();

	}

	protected static void hoverOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}

	protected static void selectElement(WebElement element, int indx) {
		Select selectObj = new Select(element);
		selectObj.selectByIndex(indx);

	}

	// Creating a custom function
	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

}
