import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CityResultScreen {
	
	static AndroidDriver<AndroidElement> driver;
	String newDate;
	Utils login;

	@BeforeClass
	public void setup() throws Exception {
		driver = BaseClass.getDriver();
		
		login = new Utils();
	}
	
	@Test(priority = 14)
	public void verifySearchCityScreen() {
		
		Assert.assertEquals(driver.findElementByXPath(Xpath.HomeScreenPath.CITY_HEADER_TEXT).getText(),
				ConstantVariables.CITY_NAME_HOME_SCREEN);
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.FAV_HEADER_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.ALERT_HEADER_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.FILTER_HEADER_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CITY_MAP_VIEW_BUTTON)).isDisplayed());	
	}
	
	@Test(priority = 15)
	public void verifyFavIconFunctionality() {
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.FAV_HEADER_ICON)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.FAV_HEADER_ICON))).click();
		
	}
	
	@Test(priority = 16)
	public void lOGIN() {
		
		login.checkEnterEmail(driver);
		login.checkEnterPassword(driver);
		login.checkSignInButton(driver);
		
	}
	
	@Test(priority = 17)
	public void verifyNotificationIconFunctionality() throws IOException, InterruptedException {
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.ALERT_HEADER_ICON))).click();
		
		login.scrollVertically(driver);
		
		login.scrollHorizontal(driver);		
	}

	@Test(priority = 18)
	public void checkMapTabFunctionality() throws IOException, InterruptedException {
		
		login.scrollVerticallyUpword(driver);
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CITY_MAP_VIEW_BUTTON)).isDisplayed());
		
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.CITY_MAP_VIEW_BUTTON))).click();
		
	}
	
	@Test(priority = 19)
	public void checkMapViewUI() throws IOException, InterruptedException {
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CITY_LIST_VIEW_BUTTON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.MAP_VIEW_PAGER)).isDisplayed());
		
	}
	
	@Test(priority = 20)
	public void swipeViewPager() throws IOException, InterruptedException {
		
		 WebElement element1 = driver.findElement(By.xpath(Xpath.LoginScreenPath.CITY_DISTANCE_TEXT));
		int endX = element1.getLocation().getX();
        int endY = element1.getLocation().getY();
		
		 WebElement element = driver.findElement(By.xpath(Xpath.LoginScreenPath.CITY_STARTING_FROM_TEXT));
	        int startX = element.getLocation().getX();
	        int startY = element.getLocation().getY();
	        
	        System.out.println("startY : "+startY+", startX : "+startX+", endY : "+endY+", endX : "+endX);
	        
	        (new TouchAction(driver))
			  .press(endX, endY)
			  .waitAction(Duration.ofMillis(500))
			  .moveTo(startX , endY)
			  .release()
			  .perform();
	}
	
	

}
