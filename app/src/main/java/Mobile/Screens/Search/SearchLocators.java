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
    @AndroidFindBy(id="com.smule.singandroid:id/search_edit_text")
    public WebElement searchBar;

    @AndroidFindBy(xpath = "//android.widget.ListView//android.widget.TextView\n")
    public List<WebElement> searchResultsDropDown;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index=2]//android.widget.TextView[@index=2]")
    public WebElement searchResult;
}
