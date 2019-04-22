package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login_page
{
    //Constructor
//===================================================================||
    public Login_page(AppiumDriver<WebElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
//===================================================================||
    //Elements
//===================================================================||
    @AndroidFindBy(id = "com.uprightpose.upright_go:id/login")
    public WebElement LOGIN_BUTTON_1;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/email_edittext")
    public WebElement EMAIL;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/email_password_edittext")
    public WebElement PASSWORD;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/connect_button")
    public WebElement LOGIN_BUTTON_2;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/toolbar_title")
    public WebElement LOGIN_TITLE;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/button_back")
    public WebElement BACK_BUTTON_ARROW;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/show_pw")
    public WebElement EYE_PASSWORD;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0' and @elementId='10']")
    public WebElement QUESSION_BUTTON;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/forgot_password_textview")
    public WebElement FORGOT_PASSWORD;


    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@elementId='15']")
    public WebElement CONNECTING_WINDOW;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/toolbar_title")
    public WebElement TURN_ON_TITLE;

//android.widget.Button[@index='0']
//android.widget.Button[@text='some text']
//android.widget.Button[@text='some text' and @index='0']
//android.widget.Button[@content-desk='some text']
//================================================================================================||
public void tapLoginButton_1()
{
    boolean loginButton_1_text = LOGIN_BUTTON_1.getText().equals("LOGIN");
    String loginButton_1_string = LOGIN_BUTTON_1.getText();

    if(LOGIN_BUTTON_1.isDisplayed())
    {
        if(loginButton_1_text = true)
        {
            LOGIN_BUTTON_1.click();
            System.out.println("LOGIN BUTTON 1 clicked is: " +  loginButton_1_text + " --- " + "OK");
        }
        else
        {
            System.out.println("LOGIN BUTTON 1 text ERROR !!!");
        }
    }
    else
    {
        System.out.println("LOGIN BUTTON 1 is not AVAILABLE !!!");
    }

}
//================================================================================================||
public void typeEmail(String email)
{
    boolean emailFieldText = EMAIL.getText().equals("EMAIL");

    if(EMAIL.isDisplayed())
    {
        if(emailFieldText = true)
        {
            EMAIL.sendKeys(email);
            System.out.println("EMAIL is filled --- OK");
        }
        else
        {
            System.out.println("EMAIL text ERROR !!!");
        }
    }
    else
    {
        System.out.println("EMAIL field is not AVAILABLE !!!");
    }
}
//======================================================================||
public void typePassword(String password)
{
    boolean passwordFieldText = PASSWORD.getText().equals("PASSWORD");

    if(PASSWORD.isDisplayed())
    {
        if(passwordFieldText = true)
        {
            PASSWORD.sendKeys(password);
            System.out.println("PASSWORD is filled --- OK");
        }
        else
        {
            System.out.println("PASSWORD text ERROR !!!");
        }
    }
    else
    {
        System.out.println("PASSWORD field is not AVAILABLE !!!");
    }
}
//======================================================================||
public void tapEyeButton()
{
    boolean eye = EYE_PASSWORD.isDisplayed();

    if(eye = true)
    {
        EYE_PASSWORD.click();
        System.out.println("EYE ICON is CLICKED --- OK");
    }
    else
    {
        System.out.println("EYE ICON is not AVAILABLE !!!");
    }
}

//======================================================================||
public void taploginButton_2()
{
    boolean signUpButton_2_text = LOGIN_BUTTON_2.getText().equals("SIGN UP");

    if(LOGIN_BUTTON_2.isDisplayed())
    {
        if(signUpButton_2_text = true)
        {
            LOGIN_BUTTON_2.click();
            System.out.println("LOGIN BUTTON 2 clicked --- OK");
        }
        else
        {
            System.out.println("LOGIN BUTTON 2 text ERROR !!!");
        }
    }
    else
    {
        System.out.println("LOGIN BUTTON 2 is not AVAILABLE !!!");
    }
}
//======================================================================||
    public void checkTurnOnTitle()
    {
        boolean turnOn = TURN_ON_TITLE.getText().equals("TURN ON");
        if(turnOn = true)
        {
            System.out.println("Passed we are LOGIN SUCCESSFUL");
        }
    }
//======================================================================||
}
