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

    @AndroidFindBy(xpath = "//android.widget.Button[@instance='0' and @index='0']")
    public WebElement QUESTION_BUTTON;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/user_details_title")
    public WebElement HI_NAME_OF_VISITOR;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/user_details_text")
    public WebElement HELP_AS_COSTOMIZE_YOUR_TRAINING_PLAN_TEXT;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/female")
    public WebElement FEMALE_ICON;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OR']")
    public WebElement OR_TEXT;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/male")
    public WebElement MALE_ICON;

    @AndroidFindBy(xpath = "//android.view.View[@index='3']")
    public WebElement HORIZONTAL_BAR_1;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/metric_system")
    public WebElement KG_CM;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/user_details_units_switch")
    public WebElement SWITCH_KG_CM__IL_INCH;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/imperial_system")
    public WebElement LB_INCH;

//---------------------------------------------------------------------------//
    @AndroidFindBy(id = "com.uprightpose.upright_go:id/weight_button")
    public WebElement WAIGHT_BATTON;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/weight_textview")
    public WebElement WEIGHT_BAR;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/customFontView3")
    public WebElement WEIGHT_TEXT;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/picker_title_textview")
    public WebElement WEIGHT_TEXT_2;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/metric")
    public WebElement lb_or_kg;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/metric")
    public WebElement WEIGHT_SET_BATTON;

    @AndroidFindBy(id = "")
    public WebElement WEIGHT_PICKER_WHEEL;

//---------------------------------------------------------------------------//
    @AndroidFindBy(id = "com.uprightpose.upright_go:id/height_button")
    public WebElement HEIGHT_BATTON;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/height_textview")
    public WebElement HEIGHT_BAR;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/user_details_text_title")
    public WebElement HEIGHT_TEXT;
//--------------------------------------------------------------------------//
    @AndroidFindBy(id = "com.uprightpose.upright_go:id/age_button")
    public WebElement AGE_BATTON;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/age_textview")
    public WebElement AGE_BAR;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/user_details_age_text_title")
    public WebElement AGE_TEXT;
//--------------------------------------------------------------------------//
    @AndroidFindBy(xpath = "//android.view.View[@index='2']")
    public WebElement HORIZONTAL_BAR_2;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/question1_text")
    public WebElement How_many_hours_do_you_sit_daily_text;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/option_1")
    public WebElement _0_3_hours;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/option_2")
    public WebElement _3_5_hours;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/option_3")
    public WebElement _5_10_hours;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/option_4")
    public WebElement _10_hours;

    @AndroidFindBy(xpath = "//android.view.View[@index='2']")
    public WebElement HORIZONTAL_BAR_3;

    @AndroidFindBy(id = "com.uprightpose.upright_go:id/question2_text")
    public WebElement How_much_do_you_suffer_from_back_pain_text;



}
