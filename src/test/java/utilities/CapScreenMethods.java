package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class CapScreenMethods
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

 //=====================================================================||
    public void tekeBitScreenshot()
    {

    }
 //=====================================================================||
 public static boolean IsPngEquals(File pngFile, byte[] pngBytes) throws IOException
 {
     BufferedImage imageA = ImageIO.read(pngFile);

     ByteArrayInputStream inStreamB = new ByteArrayInputStream(pngBytes);
     BufferedImage imageB = ImageIO.read(inStreamB);
     inStreamB.close();

     DataBufferByte dataBufferA = (DataBufferByte)imageA.getRaster().getDataBuffer();
     DataBufferByte dataBufferB = (DataBufferByte)imageB.getRaster().getDataBuffer();

     if (dataBufferA.getNumBanks() != dataBufferB.getNumBanks())
     {
         return false;
     }
     for (int bank = 0; bank < dataBufferA.getNumBanks(); bank++)
     {
         if (!Arrays.equals(dataBufferA.getData(bank), dataBufferB.getData(bank)))
         {
             return false;
         }
     }
     return true;
 }
 //=====================================================================||
 public void compareImages()throws IOException
 {

   //  byte[] picture = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);


   //  if (IsPngEquals(new File("C:\\Users\\liesn\\IdeaProjects\\UpRight_Technologies\\src\\test\\java\\originalScreenshots\\dump_2850407713095551829.png"), picture))
  //   {
       //  System.out.println("Picture is equals");
    // }
  //   else
  //   {
    //     System.out.println("Picture is not equals");
  //   }

 }
//======================================================================||














    public void getScreenshot_2() throws IOException
    {
       // folder_name = "screenshots";
       // File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // df = new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ssaa");//     new File("screenshots").mkdir();
       // String file_name = df.format(new Date()) + ".png";
       // FileUtils.copyFile(file, new File(folder_name + "/" + file_name));
    }

}
