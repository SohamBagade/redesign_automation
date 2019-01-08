import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomeScreen {
	
	static AndroidDriver<AndroidElement> driver;
	String newDate;

	@BeforeClass
	public void setup() throws Exception {
		driver = BaseClass.getDriver();
	}
	
	
	public void scrollVertically() throws IOException, InterruptedException {
		Thread.sleep(100);
		
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;
		
		(new TouchAction(driver))
		  .press(startx, starty)
		  .waitAction(Duration.ofMillis(3000))
		  .moveTo(startx , endy)
		  .release()
		  .perform();
	}
	
	public void scrollVerticallyUpword() throws IOException, InterruptedException {
		Thread.sleep(100);
		
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;
		
		(new TouchAction(driver))
		  .press(startx, endy)
		  .waitAction(Duration.ofMillis(3000))
		  .moveTo(startx , starty)
		  .release()
		  .perform();
	}

	@Test(priority = 1)
	public void TapOnWeatherIcon() throws InterruptedException {
		
		if(driver.findElement(By.xpath(Xpath.HomeScreenPath.ALLOW_BUTTON)).isDisplayed())
		{
			Thread.sleep(3000);
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
	
	@Test(priority = 8)
	public void VerifyCalenderOpenFunctionality() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_DATE_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_DATE_TEXT))).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CALENDAR_SUNDAY_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CALENDAR_MONDAY_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CALENDAR_TUESDAY_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CALENDAR_WENESDAY_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CALENDAR_THURSDAY_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CALENDAR_FRIDAY_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CALENDAR_SATURDAY_TEXT)).isDisplayed());
		
	}
	
	@Test(priority = 9)
	public void SelectTodayDateFunctionality() throws IOException, InterruptedException {
		
		scrollVertically();
		
		for(int i=14; i<=38 ;i++)
		{
			String text = "[@index = '"+i+"']";
			String Date = "//android.widget.CheckedTextView"+text;
			
			System.out.println(Date);
			
			try {
				new WebDriverWait(driver, 1)
				.until(ExpectedConditions.elementToBeClickable(By.xpath(Date))).click();
				
				int j = i+ 5;
				String newText = "[@index = '"+j+"']";
				newDate = newText;
				
			} catch (Exception e) {
				// TODO: handle exception
				return ;
			}
						
		}
		
	}
	
	
	@Test(priority = 10)
	public void selectNextDateFunctionality() throws IOException, InterruptedException
	{
		scrollVerticallyUpword();
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_DATE_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_DATE_TEXT))).click();
		
		System.out.println("New Date :"+newDate);
		
		try {
			new WebDriverWait(driver, 1)
			.until(ExpectedConditions.elementToBeClickable(By.xpath(newDate))).click();
			
			System.out.println("Click :"+"Sucessfull");
			
			}catch (Exception e) {
				// TODO: handle exception
				new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.NEXT_MONTH_TEXT))).click();
				
				new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckedTextView[@index = '10']"))).click();

			}
	}
	
	@Test(priority = 11)
	public void checkNewDateIsApplied() throws IOException, InterruptedException
	{
		scrollVerticallyUpword();
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_NEW_DATE_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_NEW_DATE_TEXT))).click();
		
	}
	
	@Test(priority = 12)
	public void selectPlayerOption() throws IOException, InterruptedException
	{
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_PLAYER_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_PLAYER_TEXT))).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.HOW_MANY_PLAYER_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.PLAYER_ONE)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.PLAYER_TWO)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.PLAYER_THREE)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.PLAYER_FOUR)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.PLAYER_ALL)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.DONE_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.PLAYER_ONE))).click();
		
	}
	
	
	@Test(priority = 13)
	public void VerifySearchButtonFunctionality() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT))).click();
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT))).click();
		driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_EDIT_TEXT)).sendKeys(ConstantVariables.CITY_NAME_HOME_SCREEN);
		
		driver.hideKeyboard();
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.DALLAS_CITY_TEXT))).click();
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SEARCH_BUTTON))).click();
		
	}
	

}
