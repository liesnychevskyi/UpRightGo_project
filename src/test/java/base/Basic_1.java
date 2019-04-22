package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Basic_1
{

    AppiumDriver<AndroidElement> driver;
    File file = new File("src\\test\\java\\app");
    File fs = new File(file, "UprightGO.apk");

    @BeforeClass
    public void setUp()
    {
        System.out.println("Step_1 is passed !!!");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platform", "Android 7.0");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sumsung Galaxy 6S");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100"); //Waiting 100 seconds before it will be closed
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        try
        {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Step_2 is passed !!!");
    }
}
