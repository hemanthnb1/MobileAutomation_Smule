package Mobile.Screens.Home;

import Mobile.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomeLocators extends BasePage {

    HomeLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(xpath="//android.widget.TextView[@text='No, thanks']")
    public WebElement noThanksBtn;

    @AndroidFindBy(id = "com.smule.singandroid:id/pre_search_title_text_view")
    public WebElement searchBtn;




    @AndroidFindBy(id = "com.smule.singandroid:id/action_message_center")
    public WebElement tapOnScreen;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Profile']")
    public WebElement profileIcon;

    @AndroidFindBy(id="com.smule.singandroid:id/action_search")
    public  WebElement searchIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Feed']")
    public WebElement feedBtn;

    @AndroidFindBy(id = "com.smule.singandroid:id/messageIcon")
    public WebElement chatIcon;

}
