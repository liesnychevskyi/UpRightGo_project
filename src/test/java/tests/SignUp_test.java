package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SignUp_page;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SignUp_test {

    //Data test
//=============================================================================||
    private String name = "Stanislav";
    private String lastName = "Liesnychevskyi";
    private String email = "zesibi@smartbusiness.me";
    private String password = "2728torikpes2728";
    private String nameOfregister = "Hi Stanislav!";
    //=============================================================================||
    AppiumDriver<WebElement> driver;
    File file = new File("src\\test\\java\\app");
    File fs = new File(file, "UprightGO.apk");

    @BeforeClass
    public void setUp()
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
    public void singUpTest() throws IOException
    {
        SignUp_page singupPage = new SignUp_page(driver);
        singupPage.tapSignButton_1();
        singupPage.typeFirstName(name);
        singupPage.typeLastName(lastName);
        singupPage.typeEmail(email);
        singupPage.typePassword(password);
        singupPage.getScreenshot_1(driver);
        singupPage.tapEyeButton();
        singupPage.getScreenshot_1(driver);
        driver.hideKeyboard();
        singupPage.tapSignButton_2();
        singupPage.registrationIsValid(nameOfregister);
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
        System.out.println("Driver QUIT --- OK");
    }

}
//temple email
//https://temp-mail.org/en/