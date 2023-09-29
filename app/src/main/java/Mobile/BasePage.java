package Mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;

import static common_utils.ConfigLoader.getCapability;

public class BasePage {
    public static AppiumDriver androidDriver;

    public AppiumDriver getDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities(getCapability());
        try {
            androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
        return  androidDriver;
    }

}
