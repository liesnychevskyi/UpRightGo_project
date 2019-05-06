package examples.DataPickerTest;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppTest
{
    @Test
    public void Test() throws MalformedURLException
    {
        dataPickerWheel.Android_LaunchApp();
    }

    @AfterTest
    public void TearDown()
    {
        dataPickerWheel.CloseApp();
    }

}
