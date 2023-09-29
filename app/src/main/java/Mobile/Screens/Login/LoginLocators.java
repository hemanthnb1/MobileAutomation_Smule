package Mobile.Screens.Login;

import Mobile.BasePage;
import Mobile.Screens.Waits.driverWaits;
import common_utils.ScrollUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class LoginLocators extends BasePage {
    public LoginLocators() {

        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

        @AndroidFindBy(xpath = "//android.widget.TextView[@text='English' and @index='0']")
        public WebElement LanguageButton;
        @AndroidFindBy(id = "com.smule.singandroid:id/yesButton")
        public WebElement okButton;

        @AndroidFindBy(id="com.smule.singandroid:id/email_button_view")
        public WebElement signinButton;

        @AndroidFindBy(id="com.smule.singandroid:id/editField")
        public  WebElement email;

        @AndroidFindBy(className = "android.widget.Button")
        public  WebElement nextButton;

        @AndroidFindBy(className = "android.widget.EditText")
        public WebElement password;

        @AndroidFindBy(id="com.smule.singandroid:id/yesButton")
        public  WebElement skipPopup;

//        @AndroidFindBy(id ="com.smule.singandroid:id/noButton")
//        public WebElement skipPoPupButton;


}
