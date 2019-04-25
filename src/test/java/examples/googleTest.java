package examples;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class googleTest
{
    WebDriver driver;
    @BeforeClass
    public void google() throws Exception
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Samsung");
        cap.setCapability("platformName","Android");
        cap.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
        cap.setCapability(CapabilityType.VERSION,"7.0");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }

    @Test
    public void tcase() throws Exception
    {
        driver.get("http://amazon.com");
        driver.findElement(By.id("nav-search-keywords")).sendKeys("abc test");
        Thread.sleep(10000);
    }
}
