package examples;

import base.Driver;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class singUp_page extends Driver
{
    PageObjects singUpPage;

    String firstName = "Stanislav";
    String lastName = "Liesnychevskyi";
    String email = "liesnychevskyi.s@gmail.com";
    String password = "2728torikpes2728";
//----------------------------------------------------------------||
    public singUp_page()
    {
        super();
        System.out.println("2 step");
        singUpPage = new PageObjects();
        PageFactory.initElements(driver, singUpPage);
        System.out.println("2 step passed!!!");
    }
//----------------------------------------------------------------|| Validation of elements
    public boolean validateSignUpPage()
    {
        boolean elements = false;
        if(singUpPage.FIRST_NAME.isDisplayed())
        {
            if(singUpPage.LAST_NAME.isDisplayed())
            {
                if(singUpPage.EMAIL.isDisplayed())
                {
                    if(singUpPage.PASSWORD.isDisplayed())
                    {
                       if(singUpPage.SING_UP_BUTTON_2.isDisplayed())
                       {
                           elements = true;
                       }
                    }
                }
            }
        }
        else
            {
            elements = false;
            }
        return elements;
    }
//------------------------------------------------------------------||
    public boolean testSignUpWithoutCredentials()
    {
        System.out.println("4 step");
        boolean singUpStatus = false;
        singUpPage.SING_UP_BUTTON_1.click();
        if (singUpPage.SING_UP_BUTTON_1.getText().equalsIgnoreCase("SIGN UP"))
        {
            singUpStatus = true;
        }
        singUpPage.FIRST_NAME.sendKeys(firstName);
        singUpPage.LAST_NAME.sendKeys(lastName);
        singUpPage.EMAIL.sendKeys(email);
        singUpPage.PASSWORD.sendKeys(password);
        singUpPage.SING_UP_BUTTON_2.click();
        if (singUpPage.SING_UP_BUTTON_2.getText().equalsIgnoreCase("SIGN UP"))
        {
            singUpStatus = true;
        }
        System.out.println("4 step passed!!!");
        return singUpStatus;

    }

//------------------------------------------------------------------------||
class PageObjects
{

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/signup")
    public AndroidElement SING_UP_BUTTON_1;


    @AndroidFindBy(id = "com.uprightpose.upright_go:id/firstname_edittext")
    public AndroidElement FIRST_NAME;


    @AndroidFindBy(id = "com.uprightpose.upright_go:id/lasttname_edittext")
    public AndroidElement LAST_NAME;


    @AndroidFindBy(id = "com.uprightpose.upright_go:id/email_edittext")
    public AndroidElement EMAIL;


    @AndroidFindBy(id = "com.uprightpose.upright_go:id/email_password_edittext")
    public AndroidElement PASSWORD;


    @AndroidFindBy(id = "com.uprightpose.upright_go:id/connect_button")
    public AndroidElement SING_UP_BUTTON_2;

}
//------------------------------------------------------------------------||

}



