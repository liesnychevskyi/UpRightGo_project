package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CapScreen
{
    String folder_name;
    DateFormat df;

    public void getScreenshot_1(AppiumDriver<WebElement> d) throws IOException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        Date date = new Date();
        String fileName = sdf.format(date);
        File des = d.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(des, new File(System.getProperty("user.dir") + "//screenshots//" + fileName + ".png"));
        System.out.println("-- Screenshot is captured --");
    }

    public void getScreenshot_2() throws IOException
    {
       // folder_name = "screenshots";
       // File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // df = new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ssaa");//     new File("screenshots").mkdir();
       // String file_name = df.format(new Date()) + ".png";
       // FileUtils.copyFile(file, new File(folder_name + "/" + file_name));
    }

}
