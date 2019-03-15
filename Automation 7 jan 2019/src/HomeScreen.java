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
	WebElement element;

	@BeforeClass
	public void setup() throws Exception {
		driver = BaseClass.getDriver();
	
			/*if(driver.findElement(By.xpath(Xpath.HomeScreenPath.HOME_TITLE)).isDisplayed())
			{
			new WebDriverWait(driver, 100)
			.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.ALLOW_BUTTON))).click();
			}*/
		
	}

	@Test(priority = 1)
	public void HomeScreenViewChecked() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.HomeScreenPath.HOME_TITLE)));
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.HOME_TITLE)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.WEATHER_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SECTION)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.PLAY_ON_THE_COURSE_SECTION)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CBS_SPORTS_LOGO_LAYOUT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CBS_SPORTS_LOGO)).isDisplayed());
	}
	
	
	@Test(priority = 2)
	public void checkSweepstakesBannerIsDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.HomeScreenPath.SWEEPSTAKES_BANNER)));
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.SWEEPSTAKES_BANNER)).isDisplayed());
	}
	
	

	

}
