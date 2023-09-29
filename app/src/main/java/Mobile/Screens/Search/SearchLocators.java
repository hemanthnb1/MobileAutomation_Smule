package Mobile.Screens.Search;

import Mobile.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchLocators extends BasePage {
    SearchLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }
    @AndroidFindBy(id = "com.smule.singandroid:id/pre_search_title_text_view")
    public WebElement searchBtn;

    @AndroidFindBy(id="com.smule.singandroid:id/search_edit_text")
    public WebElement searchBar;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index=0]//android.widget.TextView[@text='After Hours']")
    public List<WebElement> searchResults;
}
