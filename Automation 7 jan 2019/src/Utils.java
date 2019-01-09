import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utils {
	
	public Utils()
	{
		
	}


	public void checkEnterEmail(AndroidDriver<AndroidElement> driver) {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.LoginScreenPath.LOGIN_EMAIL_EDIT_TEXT)).isDisplayed());

		new WebDriverWait(driver, 100)
				.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.LoginScreenPath.LOGIN_EMAIL_EDIT_TEXT))).click();
		driver.findElement(By.xpath(Xpath.LoginScreenPath.LOGIN_EMAIL_EDIT_TEXT)).sendKeys(ConstantVariables.NEWEMAIL);
	}
	
	public void checkEnterPassword(AndroidDriver<AndroidElement> driver) {
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.LoginScreenPath.LOGIN_PASSWORD_EDIT_TEXT)).isDisplayed());

		driver.findElement(By.xpath(Xpath.LoginScreenPath.LOGIN_PASSWORD_EDIT_TEXT))
				.sendKeys(ConstantVariables.NEWPASSWORD);
	}
	
	public void checkSignInButton(AndroidDriver<AndroidElement> driver) {
		driver.hideKeyboard();
		Assert.assertTrue(driver.findElement(By.xpath(Xpath.LoginScreenPath.LOGIN_SIGN_IN_BUTTON)).isDisplayed());
		new WebDriverWait(driver, 100)
				.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.LoginScreenPath.LOGIN_SIGN_IN_BUTTON))).click();
		 }
	
	
	public void scrollVertically(AndroidDriver<AndroidElement> driver) throws IOException, InterruptedException {
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
	
	public void scrollVerticallyUpword(AndroidDriver<AndroidElement> driver) throws IOException, InterruptedException {
		Thread.sleep(100);
		
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.40);
		int startx = size.width / 2;
		
		Thread.sleep(3000);
		(new TouchAction(driver))
		  .press(startx, endy)
		  .waitAction(Duration.ofMillis(2500))
		  .moveTo(startx , starty)
		  .release()
		  .perform();
	}
	
	public void scrollHorizontal(AndroidDriver<AndroidElement> driver) throws IOException, InterruptedException {
		Thread.sleep(100);
		
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height / 2);
		int endx = (int) (size.width * 0.80);
		int startx = (int)(size.width * 0.20);
		
		(new TouchAction(driver))
		  .press(endx, starty)
		  .waitAction(Duration.ofMillis(2000))
		  .moveTo(0 , starty)
		  .release()
		  .perform();
	}

}
