package examples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class calculatorTest
{
    AppiumDriver<AndroidElement> driver;
    File file = new File("src\\test\\java\\app");
    File fs = new File(file, "UprightGO.apk");


    @BeforeClass
    public void setUp()
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platform", "Android 7.0");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy 6S");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.uprightpose.upright_go");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.uprightpose.upright_go.SplashActivity");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100"); //Waiting 10 seconds before it will be closed
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        try
        {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            System.out.println("Driver STARTED --- OK");
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
@Test
public void test()
{

}

}

//app download // https://google-inc-calculator.en.uptodown.com/android/download

