package common_utils;
import Mobile.Screens.Waits.driverWaits;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

import  static Mobile.BasePage.androidDriver;
public class ScrollUtils {

    public void scrollIntoView(String Text){
        WebElement element = (WebElement) androidDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\""+Text+"\"))"));
        driverWaits driverWaits = new driverWaits();
        driverWaits.addExplicitWaits(element);
    }
}
