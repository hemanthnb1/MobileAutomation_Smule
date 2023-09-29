package Mobile.Screens.Search;
import Mobile.Screens.Waits.driverWaits;
import org.openqa.selenium.Keys;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SearchScreen extends SearchLocators{

    driverWaits waits;
    public  SearchScreen(){
        this.waits=new driverWaits();
    }
//    public SearchScreen clickonSearchBtn(){
//        searchBtn.click();
//        return this;
//    }

    public SearchScreen searchSong(String songName){
        waits.addExplicitWaits(searchBtn);
        searchBtn.click();
        waits.addExplicitWaits(searchBar);
        searchBar.sendKeys(songName);
        searchBar.sendKeys(Keys.ENTER);
        return  this;
    }

    public String getSearchResults(){

        waits.addExplicitWaits(searchResults.get(0));
        return searchResults.get(0).getText();
    }
}
