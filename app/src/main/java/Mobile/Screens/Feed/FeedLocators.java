package Mobile.Screens.Feed;

import Mobile.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FeedLocators extends BasePage {
    FeedLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }



    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']/android.widget.ImageView[@index='2'and@clickable='true']")
    public WebElement feedOptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add to Playlist']")
    public  WebElement addToPlayList;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='myplaylist01']")
    public  WebElement clickOnMyPlayList;


}
