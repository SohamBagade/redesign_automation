import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Sweepstakes {

	static AndroidDriver<AndroidElement> driver;
	WebElement element;
	Utils utils;

	@BeforeClass
	public void setup() throws Exception {
		driver = BaseClass.getDriver();
		utils = new Utils();
	}
	
	@Test(priority = 3)
	public void tapOnSweepstakesBanner() {
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.SWEEPSTAKES_BANNER))).click();
	}
	
	@Test(priority = 4)
	public void checkSweepstakesContentDescAllViewIsDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.SweepstakesContentDescScreenPath.SHORT_DESC_TITLE)));
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesContentDescScreenPath.BACK_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesContentDescScreenPath.SHORT_DESC_TITLE)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesContentDescScreenPath.HOLDER_IMAGE_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesContentDescScreenPath.CONTEST_DETAIL_DESC)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesContentDescScreenPath.CONTEST_RULE)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesContentDescScreenPath.ENTER_SWEEPSTAKES_BUTTON)).isDisplayed());
		
	
	}
	
	@Test(priority = 5)
	public void tapOnEnterSweepStakes() {
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesContentDescScreenPath.ENTER_SWEEPSTAKES_BUTTON))).click();	
	}
	
	@Test(priority = 6)
	public void checkSweepstakeEmailScreenUI() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.SweepstakesEmailScreenPath.EMAIL_TITLE)));
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesEmailScreenPath.CANCEL_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesEmailScreenPath.EMAIL_TITLE)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesEmailScreenPath.EMAIL_HOLDER_ICON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesEmailScreenPath.EMAIL_ADDRESS)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesEmailScreenPath.EMAIL_USED_DESC)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesEmailScreenPath.CONTINUE_BUTTON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesEmailScreenPath.EMAIL_EDIT_TEXT)).isDisplayed());		
	}
	
	@Test(priority = 7)
	public void enterEmail() {
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesEmailScreenPath.EMAIL_EDIT_TEXT))).click();
		driver.findElement(By.xpath(Xpath.SweepstakesEmailScreenPath.EMAIL_EDIT_TEXT)).sendKeys(ConstantVariables.CORRECTEMAIL);
		
		driver.hideKeyboard();
	}
	
	@Test(priority = 8)
	public void tapOnEmailContinueButton() {
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesEmailScreenPath.CONTINUE_BUTTON))).click();		
	}
	
	@Test(priority = 9)
	public void checkSweepstakePasswordScreenUI() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.SweepstakesPasswordScreenPath.PASSWORD_TITLE)));
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesPasswordScreenPath.CANCEL_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesPasswordScreenPath.PASSWORD_TITLE)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesPasswordScreenPath.PASSWORD_ADDRESS)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesPasswordScreenPath.PASSWORD_USED_DESC)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesPasswordScreenPath.CONTINUE_BUTTON)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesPasswordScreenPath.PASSWORD_EDIT_TEXT)).isDisplayed());		
	}
	
	@Test(priority = 10)
	public void enterPassword() {
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesPasswordScreenPath.PASSWORD_EDIT_TEXT))).click();
		driver.findElement(By.xpath(Xpath.SweepstakesPasswordScreenPath.PASSWORD_EDIT_TEXT)).sendKeys(ConstantVariables.CORRECTPASSWORD);
		
		driver.hideKeyboard();
	}
	
	@Test(priority = 11)
	public void tapOnPasswordContinueButton() {
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesPasswordScreenPath.CONTINUE_BUTTON))).click();		
	}
	
	@Test(priority = 12)
	public void checkWhoAreYouScreenUI() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.WHO_ARE_YOU_TEXT)));
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesPasswordScreenPath.CANCEL_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.WHO_ARE_YOU_TEXT)).isDisplayed());
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.FIRST_NAME_EDIT_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.FIRST_NAME_TEXT)).isDisplayed());
		
		utils.scrollVertically(driver);
	
	}
	
	@Test(priority = 13)
	public void checkWhoAreYouScreenUI2() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.LAST_NAME_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.LAST_NAME_EDIT_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.ZIP_CODE_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.ZIP_CODE_EDIT_TEXT)).isDisplayed());	
	}
	
	@Test(priority = 14)
	public void tapOnSkillLevel() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.SKILL_LEVEL_EDIT_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.SKILL_LEVEL_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.SKILL_LEVEL_EDIT_TEXT))).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.OK_BUTTON)).isDisplayed());
		
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.OK_BUTTON))).click();
		
	}
	@Test(priority = 15)
	public void tapOnFrequencyLevel() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.FREQUENCY_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.FREQUENCY_EDIT_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.FREQUENCY_EDIT_TEXT))).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.OK_BUTTON)).isDisplayed());
		
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.OK_BUTTON))).click();
		
	}
	
	@Test(priority = 16)
	public void tapOnHandicapLevel() {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.HANDICAP_TEXT)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.HANDICAP_EDIT_TEXT)).isDisplayed());
		
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.HANDICAP_EDIT_TEXT))).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.OK_BUTTON)).isDisplayed());
		
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.OK_BUTTON))).click();
		
	}
	
	@Test(priority = 17)
	public void tapOnContinueButton() throws IOException, InterruptedException {
		
		utils.scrollVertically(driver);
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.SUBMIT_BUTTON)).isDisplayed());
		
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.SUBMIT_BUTTON))).click();
		
	}
	
	@Test(priority = 18)
	public void tapOnGoHomeButton() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.GO_HOME_BUTTON)));
		
				
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.GO_HOME_BUTTON)).isDisplayed());
		
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.GO_HOME_BUTTON))).click();
		
	}
	
	@Test(priority = 19)
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
	
	
	@Test(priority = 20)
	public void checkSweepstakesBannerIsDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.HomeScreenPath.SWEEPSTAKES_BANNER)));
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.HomeScreenPath.SWEEPSTAKES_BANNER)).isDisplayed());
	}
	
	@Test(priority = 21)
	public void tapOnSweepstakesBanner2() {
		new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.HomeScreenPath.SWEEPSTAKES_BANNER))).click();
	}
	
	@Test(priority = 22)
	public void checkEnterButtonIsDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.ENTERED_BUTTON)));
		
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.SweepstakesWhoAreYouScreenPath.ENTERED_BUTTON)).isDisplayed());
		
	
	}
	
	
}
