import org.openqa.selenium.By;
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
			}*/
		
	}

	@Test(priority = 1)
	public void HomeScreenViewChecked() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.HOME_TITLE)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.WEATHER_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.BOOK_TEE_TIME_SECTION)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.PLAY_ON_THE_COURSE_SECTION)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.FIND_A_PRO_SECTION)).isDisplayed());
	}
	
	
	@Test(priority = 2)
	public void TapOnWeatherIcon() {
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.WEATHER_ICON))).click();
	}
	
	

	

}
