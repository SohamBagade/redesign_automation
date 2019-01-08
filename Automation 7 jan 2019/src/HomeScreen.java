import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomeScreen {
	
	static AndroidDriver<AndroidElement> driver;

	@BeforeClass
	public void setup() throws Exception {
		driver = BaseClass.getDriver();
	
			/*if(driver.findElement(By.xpath(Xpath.HomeScreenPath.HOME_TITLE)).isDisplayed())
			{
			new WebDriverWait(driver, 100)
			.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.ALLOW_BUTTON))).click();
			
			Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.HOME_TITLE)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SECTION)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.PLAY_ON_THE_COURSE_SECTION)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.FIND_A_PRO_SECTION)).isDisplayed());
			}*/
		
	}
	
	public void cleatTextFully(WebElement element) {
	    int stringLength = element.getText().length();
	    
	    System.out.println("stringLength : "+stringLength);

	    for (int i = 0; i < stringLength; i++) {
	        driver.pressKeyCode(22); // "KEYCODE_DPAD_RIGHT"
	    }

	    for (int i = 0; i < stringLength; i++) {
	        driver.pressKeyCode(67); // "KEYCODE_DEL"
	    }
	}

	@Test(priority = 1)
	public void TapOnWeatherIcon() {
		
		if(driver.findElement(By.xpath(Xpath.HomeScreenPath.ALLOW_BUTTON)).isDisplayed())
		{
				new WebDriverWait(driver, 100)
				.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.ALLOW_BUTTON))).click();
		}
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.WEATHER_ICON)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.WEATHER_ICON))).click();

	}
	
	
	@Test(priority = 2)
	public void TapOnWeatherCloseIcon() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.WEATHER_CLOSE_ICON)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.WEATHER_CLOSE_ICON))).click();
	}
	
	@Test(priority = 3)
	public void TapOnBookTeeTimeSection() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SECTION)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SECTION))).click();
	}
	
	@Test(priority = 4)
	public void CheckViewBookTeeTimeSection() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_DATE_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_PLAYER_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_BUTTON)).isDisplayed());
	}
	
	@Test(priority = 5)
	public void VerifySearchEditTextFunctionality() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT))).click();
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT))).click();
		driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT)).sendKeys(ConstantVariables.CITY_NAME_LIST_SCREEN);
		
	}
	
	@Test(priority = 6)
	public void VerifyClearTextFunctionality() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_CROSS)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_CROSS))).click();
		
		Assert.assertEquals(driver.findElementByXPath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT).getText(),
				"Any name, course, or city");
		
	}
	
	@Test(priority = 7)
	public void VerifyBackArrowFunctionality() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_EDIT_TEXT_BACK_ARROW)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_EDIT_TEXT_BACK_ARROW))).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.TOP_TEE_TIME_TEXT)).isDisplayed());
		
	}
	
	@Test(priority = 7)
	public void VerifyCalenderOpenFunctionality() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_DATE_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_DATE_TEXT))).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.TOP_TEE_TIME_TEXT)).isDisplayed());
		
	}
	
	

	

}
