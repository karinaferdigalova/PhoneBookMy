package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void preCondition(){
        if(app.getHelperUser ().isLogged ())
            app.getHelperUser ().logout();
    }

    @Test
public void loginSuccess(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser ().fillLoginRegistrationForm
                ("karina29@gmail.com", "karinA29!");
        app.getHelperUser ().submitLogin ();
        Assert.assertTrue (app.getHelperUser().isLogged());

}
@Test
    public void loginSuccessModel(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser ().fillLoginRegistrationForm
                ("karina29@gmail.com", "karinA29!");
        app.getHelperUser ().submitLogin ();
        Assert.assertTrue (app.getHelperUser().isLogged());

    }
    @Test
    public void loginWrongEmail(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser ().fillLoginRegistrationForm
                ("karina29gmail.com", "karinA29!");
        app.getHelperUser ().submitLogin ();
        Assert.assertTrue (app.getHelperUser ().isAlertPresent("Wrong email or password"));

    }

    @Test
    public void loginWrongPassword(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser ().fillLoginRegistrationForm
                ("karina29@gmail.com", "karinA9!");
        app.getHelperUser ().submitLogin ();
        Assert.assertTrue (app.getHelperUser ().isAlertPresent("Wrong email or password"));

    }
    @Test
    public void unregistaredUser(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser ().fillLoginRegistrationForm
                ("karina2@gmail.com", "karinA29!");
        app.getHelperUser ().submitLogin ();

    }

}
