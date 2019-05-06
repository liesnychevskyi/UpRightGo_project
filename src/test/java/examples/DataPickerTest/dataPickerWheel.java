package examples.DataPickerTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class dataPickerWheel
{
    public static AppiumDriver<WebElement> driver;
    public static DesiredCapabilities cap;

    static File file = new File("src\\test\\java\\app");
    static File fs = new File(file, "ApiDemos-debugNew.apk");

    public static void Android_LaunchApp() throws MalformedURLException
    {
        cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName","Samsung 6s");
        cap.setCapability("appPakage", "");
        cap.setCapability("appActivity", "");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        Assert.assertNotNull(driver);
        MobileDriver.setWebDriver(driver); // reset WebDriver
    }

    public static void CloseApp()
    {
        driver.quit();
    }
}
