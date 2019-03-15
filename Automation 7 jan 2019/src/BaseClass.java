import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	private static AndroidDriver<AndroidElement> driver;
	private static BaseClass sInstance;

	private BaseClass() {
	}

	public static BaseClass getInstance() {
		if (sInstance == null) {
			sInstance = new BaseClass();
		}
		return sInstance;
	}
		public static AndroidDriver<AndroidElement> getDriver() {
			if (driver == null) {
				// Created object of DesiredCapabilities class.
				DesiredCapabilities capability = new DesiredCapabilities();

				// Set android deviceName desired capability. Set your device name.
				capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Device");

				// Set BROWSER_NAME desired capability. It's Android in our case here.

				// Set android VERSION desired capability. Set your mobile device's OS version.
				capability.setCapability(MobileCapabilityType.VERSION, "5.0");

				// Set android platformName desired capability. It's Android in our case here.
				capability.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

				// Set android appActivity desired capability. It is
				capability.setCapability("appPackage", "com.supremegolf.app");
				capability.setCapability("appActivity", "ui.activity.SplashActivity");

				// Created object of RemoteWebDriver will all set capabilities.
				try {
					driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
					//driver = new AndroidDriver<>(new URL("http://192.168.10.101:5555/wd/hub"), capability);
					Thread.sleep(6000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;

			
		}
	}

