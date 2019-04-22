package base;

import io.appium.java_client.android.AndroidDriver;

public class Driver extends Basic_2
{
    protected AndroidDriver driver;

    public Driver()
    {
        this.driver = super.getDriver();
    }
}
