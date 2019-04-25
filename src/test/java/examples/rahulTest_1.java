package examples;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class rahulTest_1
{
    public class base
    {
        public  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
        {
            AndroidDriver<AndroidElement> driver;

// TODO Auto-generated method stub
            File appDir = new File("src");
            File app = new File(appDir, "API_Demos.apk");
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            return driver;
        }

    }
}