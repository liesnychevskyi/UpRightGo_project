package examples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flashElementTest
{

    private String APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.8.0/TheApp-v1.8.0.apk";

    private AppiumDriver driver;
    private WebDriverWait wait;

    private By loginScreen = MobileBy.AccessibilityId("Login Screen");

    @BeforeTest
    public void setUp() throws IOException
    {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Samsung 6s");
        caps.setCapability("automationName", "Espresso");
        caps.setCapability("forceEspressoRebuild", true);
        caps.setCapability("useKeystore", false);
       // caps.setCapability("keystorePath", "C:\\Users\\liesn\\keysAndroid\\my-release-key.keystore"); // <-- replace with an appropriate path on your filesystem
        caps.setCapability("keystorePassword", "foo");
        caps.setCapability("keyAlias", "androiddebugkeystore");
        caps.setCapability("keyPassword", "foo");


        caps.setCapability("app", APP);
        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @AfterTest
    public void tearDown()
    {
        try
        {
            driver.quit();
        }
        catch (Exception ign) {}
    }

    @Test
    public void testFlashElement()
    {
        WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(loginScreen));

        HashMap<String, Object> scriptArgs = new HashMap<String, Object>();
        scriptArgs.put("element", ((RemoteWebElement)el).getId());
        scriptArgs.put("durationMillis", 500); // how long should each flash take?
        scriptArgs.put("repeatCount", 50); // how many times should we flash?

        driver.executeScript("mobile: flashElement", scriptArgs);
    }
}