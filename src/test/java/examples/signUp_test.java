package examples;

import org.testng.annotations.Test;

 public class signUp_test
{
    @Test
    public void testSignUp()
    {
        System.out.println("1 step");
        singUp_page signUpPage = new singUp_page();
        System.out.println("1 step passed!!!");
        if(signUpPage.validateSignUpPage() == true)
        {
            System.out.println("3 step");
            signUpPage.testSignUpWithoutCredentials();
            System.out.println("3 step passed");
            System.out.println("Pass");
        }
        else
            {
            System.out.println("Validation failed");
            }

    }
}
