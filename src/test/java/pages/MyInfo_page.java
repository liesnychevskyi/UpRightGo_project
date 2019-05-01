package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MyInfo_page
{
    //Constructor
//===================================================================||
    public MyInfo_page(AppiumDriver<WebElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
//===================================================================||

//Elements
//===================================================================||

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/exit_my_info")
    public WebElement EXIT_X_ICON_FROM_MY_INFO;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/toolbar_title")
    public WebElement MY_INFO_TEXT;

    @AndroidFindBy(id = "")
    public WebElement PRIVACY_POLICY_BUTTON;

    @AndroidFindBy(id = "")
    public WebElement TERMS_BUTTON;

    @AndroidFindBy(xpath = "")
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
    public WebElement VERTICAL_BAR_2;

    @AndroidFindBy(className = "android.widget.Button")
    public WebElement QUESTION_BATTON;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/button_back")
    public WebElement BACK_ARROW;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/toolbar_title")
    public WebElement SIGN_UP_LABLE;

    @AndroidFindBy(className = "android.view.View")
    public WebElement VERTICAL_BAR_1;

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

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/user_details_title")
    public WebElement REGISTER_NAME;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/show_pw")
    public WebElement EYE_PASSWORD;

}
