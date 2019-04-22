package examples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class testSingUp
{

        AppiumDriver<AndroidElement> driver;
        File file = new File("src\\test\\java\\app");
        File fs = new File(file, "UprightGO.apk");

        @BeforeTest
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
            }
            catch (MalformedURLException e)
            {
                e.printStackTrace();
            }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            System.out.println("Step_2 is passed !!!");
        }
        @Test
        public void singUp()
        {
            driver.findElementById("com.uprightpose.upright_go:id/signup").click(); //push the 'SIGN UP' button
            driver.findElementById("com.uprightpose.upright_go:id/firstname_edittext").sendKeys("Stanislav");//type 'FIRST NAME'
            driver.findElementById("com.uprightpose.upright_go:id/lasttname_edittext").sendKeys("Liesnychevsky");//type 'LAST NAME'
            driver.findElementById("com.uprightpose.upright_go:id/email_edittext").sendKeys("liesnychevskyi.s@gmail.com");//type 'EMAIL'
            driver.findElementById("com.uprightpose.upright_go:id/email_password_edittext").sendKeys("2728torikpes2728");//type 'PASSWORD'
            driver.hideKeyboard(); //driver hide keyboard
            driver.findElementById("com.uprightpose.upright_go:id/connect_button").click(); //push the 'SING UP inside'
        }

        @AfterTest
        public void tearDown()
        {
            driver.quit();
            System.out.println("Step_3 is passed !!!");
        }


    }
//video
//https://blog.testproject.io/2018/07/31/page-object-appium-tests-tutorial-video/

