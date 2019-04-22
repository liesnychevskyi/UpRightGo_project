package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Basic_2
{
    File file = new File("src\\test\\java\\app");
    File fs = new File(file, "UprightGO.apk");
    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private static AndroidDriver androidDriver = null;

    private String appiumPort = "4723";
    private String serverIp = "127.0.0.1";

    @BeforeClass
    public void setUp()
    {
        initDriver();
    }

    public AndroidDriver getDriver()
    {
        return androidDriver;
    }

    private void initDriver()
    {
        System.out.println("<<== Inside initDriver method ==>>");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        cap.setCapability("noReset",true);
        String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";

        try
        {
            System.out.println("Argument to driver object : " + serverUrl);
            androidDriver = new AndroidDriver(new URL(serverUrl),capabilities);
        }
        catch (MalformedURLException ex)
        {
            throw new RuntimeException("appium driver could not be instalised for device");
        }
           System.out.println("Driver in initdriver is : " + androidDriver);
    }

    public void tearDown()
    {
        androidDriver.quit();
    }
}
