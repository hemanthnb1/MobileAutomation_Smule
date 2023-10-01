package Mobile.Screens.PlayList;

import Mobile.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class PlayListLocators extends BasePage {
    public PlayListLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='newtracks']")
    public WebElement myPlaylist;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup")
    public ArrayList<WebElement> recordings;
}
