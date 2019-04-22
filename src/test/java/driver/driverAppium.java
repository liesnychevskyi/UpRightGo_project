package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.omg.CORBA.MARSHAL;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class driverAppium
{
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException
    {
        File file = new File("src\\test\\java\\app");
        File fs = new File(file, "UprightGO.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "samsunng galaxy 6s");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }
    // AndroidDriver<AndroidElement> driver = Capabilities();  call this driver

}
