package Mobile.Screens.HomePage;

import Mobile.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLocators extends BasePage {

    HomeLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(xpath="//android.widget.TextView[@text='No, thanks']")
    public WebElement noThanksBtn;




    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Messages\"]")
    public WebElement messageIcon;

    @AndroidFindBy(id="com.smule.singandroid:id/action_search")
    public  WebElement searchIcon;

}
