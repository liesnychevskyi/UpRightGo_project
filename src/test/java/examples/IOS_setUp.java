package examples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class IOS_setUp
{
    public void isoTest() throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X (11.2)");
        cap.setCapability(MobileCapabilityType.UDID, "0F467540-9C4E");
        cap.setCapability(MobileCapabilityType.APP, "pathtoapp");

        AppiumDriver<MobileElement> appium = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        appium.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        MobileElement element = appium.findElementByXPath("//");
        element.setValue("some text to type"); // sendKeys analog

        WebDriverWait wait = new WebDriverWait(appium, 60); // explicitly wait until condition
        wait.until(ExpectedConditions.elementToBeClickable(By.id("some_id"))).click();


    }
}
