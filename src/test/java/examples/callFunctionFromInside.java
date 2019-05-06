package examples;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class callFunctionFromInside
{
    private String APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.8.1/TheApp-v1.8.1.apk";

    private AppiumDriver driver;

    @BeforeTest
    public void setUp() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Samsung 6s");
        caps.setCapability("automationName", "Espresso");
        caps.setCapability("app", APP);
        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    @AfterTest
    public void tearDown()
    {
        try {
            driver.quit();
        } catch (Exception ign) {}
    }

    @Test
    public void testBackdoor()
    {
        ImmutableMap<String, Object> scriptArgs = ImmutableMap.of(
                "target", "application",
                "methods", Arrays.asList(ImmutableMap.of(
                        "name", "raiseToast",
                        "args", Arrays.asList(ImmutableMap.of(
                                "value", "Hello from the test script!",
                                "type", "String"
                        ))
                ))
        );

        driver.executeScript("mobile: backdoor", scriptArgs);
        try { Thread.sleep(2000); } catch (Exception ign) {} // pause to allow visual verification
    }

}
