package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.CapScreenMethods;

public class SignUpWithTheSameMail_page extends CapScreenMethods
{
    //Constructor
//===================================================================||
    public SignUpWithTheSameMail_page(AppiumDriver<WebElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
//===================================================================||

//Elements
//===================================================================||


    @AndroidFindBy(id = "com.uprightpose.upright_go:id/shop_upright")
    public WebElement ORDER_HERE_BATTON;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOGIN']")
    public WebElement LOGIN_INSIDE_SIGNUP;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/welcome_legal2")
    public WebElement PRIVACY_POLICY_BUTTON;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/welcome_legal1")
    public WebElement TERMS_BUTTON;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='&']")
    public WebElement AND_SIGN;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='UPRIGHT GO?']")
    public WebElement UPRIGHTGO_TEXT;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Don't have an']")
    public WebElement DONT_HAVE_AN_TEXT;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='By signing up, I accept the']")
    public WebElement I_ACCEPT_TEXT;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Already have an account?'")
    public WebElement ALREADY_HAVE_AN_ACCOUNT_TEXT;

    @AndroidFindBy(className = "android.widget.Button")
    public WebElement HORIZONTAL_BAR_2;

    @AndroidFindBy(className = "android.widget.Button")
    public WebElement QUESTION_BATTON;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/button_back")
    public WebElement BACK_ARROW;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/toolbar_title")
    public WebElement SIGN_UP_LABLE;

    @AndroidFindBy(className = "android.view.View")
    public WebElement HORIZONTAL_BAR_1;

    @AndroidFindBy(xpath = "//android.view.View[contains(@resource-id,'com.uprightpose.upright_go:id/gif_view')]")
    public WebElement UPRIGHTGO_LABEL;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/signup")
    public WebElement SING_UP_BUTTON_1;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/firstname_edittext")
    public WebElement FIRST_NAME;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/lasttname_edittext")
    public WebElement LAST_NAME;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/email_edittext")
    public WebElement EMAIL;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/email_password_edittext")
    public WebElement PASSWORD;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/connect_button")
    public WebElement SING_UP_BUTTON_2;

    @AndroidFindBy(id = "android:id/alertTitle")
    public WebElement TROUBLE_COMLETING_REQUEST_POP_UP;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/show_pw")
    public WebElement EYE_PASSWORD;

    @AndroidFindBy(id = "android:id/message")
    public WebElement UserAccountAlreadyExsistText;


//===================================================================||

    //Methods
//===================================================================||
    public void checkHorizontalBar()
    {
        boolean label = HORIZONTAL_BAR_1.isDisplayed();
        try
        {
            if(label = true)
            {
                System.out.println("Vertical bar is present --- OK");
            }
            else
            {
                System.out.println("Vertical bar is not present ERROR !!!");
            }
        }
        catch (StackOverflowError e)
        {
            System.out.println(e.getMessage());
        }

    }
    //===================================================================||
    public void checkLabel()
    {
        boolean label = UPRIGHTGO_LABEL.isDisplayed();
        try
        {
            if(label = true)
            {
                System.out.println("Logo is present --- OK");
            }
            else
            {
                System.out.println("Logo is not present ERROR !!!");
            }
        }
        catch (StackOverflowError e)
        {
            System.out.println(e.getMessage());
        }

    }
    //===================================================================||
    public void tapSignButton_1()
    {
        boolean signUpButton_1_text = SING_UP_BUTTON_1.getText().equals("SIGN UP");
        String signUpButton_1_string = SING_UP_BUTTON_1.getText();

        if(SING_UP_BUTTON_1.isDisplayed())
        {
            if(signUpButton_1_text = true)
            {
                SING_UP_BUTTON_1.click();
                System.out.println("SIGN UP button 1 clicked is: " +  signUpButton_1_text + " --- " + "OK");
            }
            else
            {
                System.out.println("SIGN UP button 1 text ERROR !!!");
            }
        }
        else
        {
            System.out.println("SIGN UP button 1 is not AVAILABLE !!!");
        }

    }
    //-------------------------------------------------------------------||
    public void typeFirstName(String firstName)
    {
        boolean firstNameFieldText = FIRST_NAME.getText().equals("FIRST NAME");

        if(FIRST_NAME.isDisplayed())
        {
            if(firstNameFieldText = true)
            {
                FIRST_NAME.sendKeys(firstName);
                System.out.println("FIRST NAME is filled --- OK");
            }
            else
            {
                System.out.println("FIRST NAME text ERROR !!!");
            }
        }
        else
        {
            System.out.println("FIRST NAME field is not AVAILABLE !!!");
        }
    }
    //-------------------------------------------------------------------||
    public void typeLastName(String lastName)
    {
        boolean lastNameFieldText = LAST_NAME.getText().equals("LAST NAME");

        if(LAST_NAME.isDisplayed())
        {
            if(lastNameFieldText = true)
            {
                LAST_NAME.sendKeys(lastName);
                System.out.println("LAST NAME is filled --- OK");
            }
            else
            {
                System.out.println("LAST NAME text ERROR !!!");
            }
        }
        else
        {
            System.out.println("LAST NAME field is not AVAILABLE !!!");
        }
    }
    //--------------------------------------------------------------------||
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
    //--------------------------------------------------------------------||
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
    //--------------------------------------------------------------------||
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
    //--------------------------------------------------------------------||
    public void tapSignButton_2()
    {
        boolean signUpButton_2_text = SING_UP_BUTTON_2.getText().equals("SIGN UP");

        if(SING_UP_BUTTON_2.isDisplayed())
        {
            if(signUpButton_2_text = true)
            {
                SING_UP_BUTTON_2.click();
                System.out.println("SING UP button 2 clicked --- OK");
            }
            else
            {
                System.out.println("SIGN UP button 2 text ERROR !!!");
            }
        }
        else
        {
            System.out.println("SIGN UP button 2 is not AVAILABLE !!!");
        }
    }

    //---------------------------------------------------------------------||
    public String registrationIsFailedPopUp(String popupmassage)
    {
        String registration_text = TROUBLE_COMLETING_REQUEST_POP_UP.getText();

        if(TROUBLE_COMLETING_REQUEST_POP_UP.isDisplayed())
        {
            if(registration_text.equals(popupmassage))
            {
                System.out.println("SING UP IS NOT SUCCESS --- OK");
            }
            else
            {
                System.out.println("POP-UP ERROR !!!");
            }
        }
        return popupmassage;
    }
//---------------------------------------------------------------------||
public String checkUserAccountAlreadyExistText(String text)
{
    String registration_text = UserAccountAlreadyExsistText.getText();

    if(TROUBLE_COMLETING_REQUEST_POP_UP.isDisplayed())
    {
        if(registration_text.equals(text))
        {
            System.out.println(" -User account already exist text- SUCCESS --- OK");
        }
        else
        {
            System.out.println("User account already exist ERROR !!!");
        }
    }
    return text;
}


//---------------------------------------------------------------------||
}
