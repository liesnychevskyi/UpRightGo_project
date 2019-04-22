package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login_page;
import pages.SignUp_page;
import driver.driverAppium;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Login_test extends driverAppium
{
    //Data test
//=============================================================================||

    private String email = "liesnychevskyi.s@gmail.com";
    private String password = "2728torikpes2728";
    AppiumDriver<WebElement> driver;
    //=============================================================================||

    File file = new File("src\\test\\java\\app");
    File fs = new File(file, "UprightGO.apk");

    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platform", "Android 7.0");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sumsung Galaxy 6S");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100"); //Waiting 100 seconds before it will be closed
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        try
        {
            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            System.out.println("Driver STARTED --- OK");
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void loginTest() throws IOException
    {
        Login_page loginPage = new Login_page(driver);
        loginPage.tapLoginButton_1();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.taploginButton_2();
        loginPage.checkTurnOnTitle();
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
        System.out.println("Driver QUIT --- OK");
    }

}
