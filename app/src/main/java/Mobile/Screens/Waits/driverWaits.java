package Mobile.Screens.Waits;

import Mobile.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class driverWaits extends BasePage {
    WebDriverWait wait;
    public driverWaits(){
       this.wait =new WebDriverWait(androidDriver,Duration.ofMillis(15000));
    }
    public WebElement addExplicitWaits(WebElement by){
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public List<WebElement> addExplicitWaitsforListOfElements(List<WebElement> by){
        return wait.until(ExpectedConditions.visibilityOfAllElements(by));
    }

}
