package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SignUp_page;
import utilities.CapScreenMethods;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SignUp_test extends CapScreenMethods
{

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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SignUp_page signupPage = new SignUp_page(driver);
        signupPage.checkLabel();
        signupPage.checkVerticalBar();
        signupPage.tapSignButton_1();
        signupPage.typeFirstName(name);
        signupPage.typeLastName(lastName);
        signupPage.typeEmail(email);
        signupPage.typePassword(password);
        signupPage.getScreenshot_1(driver);
        signupPage.tapEyeButton();
        signupPage.getScreenshot_1(driver);
        driver.hideKeyboard();
        signupPage.tapSignButton_2();
        signupPage.registrationIsValid(nameOfregister);
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
        System.out.println("Driver QUIT --- OK");
    }

//=======================================================================================||

//=======================================================================================||

}
//http://qaru.site/questions/1248917/how-to-compare-screenshots-to-a-reference-image-using-appium
//https://docs.opencv.org/3.0-beta/doc/py_tutorials/py_feature2d/py_matcher/py_matcher.html
//http://dzaiats.github.io/appium-sikuli-driver/
//temple email
//https://temp-mail.org/en/
//https://www.ibm.com/developerworks/community/blogs/mobileblog/entry/mirroring_an_android_device_screen_onto_your_desktop?lang=en

