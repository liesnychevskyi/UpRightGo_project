package examples;

import org.testng.annotations.*;

public class testNGmethods
{
    @BeforeClass
    public void test_1()
    {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void test_2()
    {
        System.out.println("@AfterClass");
    }

    @BeforeTest
    public void test_3()
    {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void test_4()
    {
        System.out.println("@AfterTest");
    }

    @BeforeMethod
    public void test_5()
    {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void test_6()
    {
        System.out.println("@AfterMethod");
    }

    @BeforeSuite
    public void test_7()
    {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void test_8()
    {
        System.out.println("@AfterSuite");
    }

    @Test
    public void test_9()
    {
        System.out.println("@Test");
    }


    @BeforeGroups
    public void test_10()
    {
        System.out.println("@BeforeGroups");
    }

    @AfterGroups
    public void test_11()
    {
        System.out.println("@AfterGroups");
    }

   // @Factory
    public void test_12()
    {
        System.out.println("@Factory");
    }

   // @DataProvider
    public void test_13()
    {

    }

    @Parameters
    public void test_14()
    {
        System.out.println("@Parameters");
    }

}
