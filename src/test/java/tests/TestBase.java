package tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    static ApplicationManager app = new ApplicationManager ();

    @BeforeSuite
    public static void setApp() {
        //вызов инит
        app.init ();
    }

    @AfterSuite
    public void tearDown() {
        //вызов стоп
        app.stop ();
    }

}
