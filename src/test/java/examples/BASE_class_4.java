package examples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.CapabilitiesReader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BASE_class_4
{

    static AppiumDriver<AndroidElement> driver = null;
    static File file = new File("src\\test\\java\\app");
    static File fs = new File(file, "UprightGO.apk");


    @BeforeClass
    public void BASE_class_4()
    {
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("platformName", "Android 7.0");
//        cap.setCapability("deviceName", "Sumsung Galaxy 6S");
//        cap.setCapability("newCommandTimeOut", "100"); //Waiting 100 seconds before it will be closed
//        cap.setCapability("app", fs.getAbsolutePath());

        CapabilitiesReader cap_1 = new CapabilitiesReader();  // from capClass

        try
        {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap_1.getCapabilities());
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
