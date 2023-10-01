package Mobile.Screens.Profile;

import Mobile.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class ProfileLocators extends BasePage {

    public ProfileLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Playlists']")
    public WebElement playListIcon;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='6']\n")
    public  WebElement hamburgerMenue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']\n")
    public WebElement settingsIcon;

    @AndroidFindBy(id = "com.smule.singandroid:id/email_field")
    public WebElement userEmail;

    @AndroidFindBy(id = "com.smule.singandroid:id/username_field")
    public WebElement userName;
}
