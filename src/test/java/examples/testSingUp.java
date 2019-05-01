package examples;

import org.testng.annotations.Test;

public class testSingUp extends BASE_class_4
{
     //   public testSingUp() throws MalformedURLException
     //   {
     //       super();
     //   }

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

    }
//video
//https://blog.testproject.io/2018/07/31/page-object-appium-tests-tutorial-video/

