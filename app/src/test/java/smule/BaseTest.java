package smule;

import Mobile.BasePage;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

    AppiumDriver androidDriver;
    @BeforeClass
    void getDriver(){
        BasePage basePage = new BasePage();
        this.androidDriver= basePage.getDriver();
    }

    @AfterClass
    void quitDriver(){
        androidDriver.quit();
    }

}
