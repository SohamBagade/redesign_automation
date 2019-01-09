import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CityResultScreen {
	
	static AndroidDriver<AndroidElement> driver;
	String newDate;

	@BeforeClass
	public void setup() throws Exception {
		driver = BaseClass.getDriver();
	}
	
	@Test(priority = 14)
	public void VerifySearchCityScreen() {
		
		Assert.assertEquals(driver.findElementByXPath(Xpath.HomeScreenPath.CITY_HEADER_TEXT).getText(),
				ConstantVariables.CITY_NAME_HOME_SCREEN);
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.FAV_HEADER_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.ALERT_HEADER_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.FILTER_HEADER_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.CITY_MAP_VIEW_BUTTON)).isDisplayed());
		
	}

}
