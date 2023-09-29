package smule;

import Mobile.BasePage;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

    @BeforeClass
    void getDriver(){
        BasePage basePage = new BasePage();
       AppiumDriver androiDriver= basePage.getDriver();

    }

}
