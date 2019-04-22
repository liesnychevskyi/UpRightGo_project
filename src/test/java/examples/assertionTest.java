package examples;

import org.testng.Assert;
import org.testng.annotations.Test;


public class assertionTest
{
    @Test
    public void TestAssert()
    {
        Assert.assertEquals("a","a");
    }

    @Test(enabled = false)
    public void TestAssert_1()
    {
        Assert.assertNotEquals('q','w');
    }
}
