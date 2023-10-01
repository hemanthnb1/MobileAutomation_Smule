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
        waits.addExplicitWaits(searchBar);
        searchBar.sendKeys(songName);
        return  this;
    }

    public SearchScreen selectSearchResults(){
        waits.addExplicitWaitsforListOfElements(searchResultsDropDown);
         searchResultsDropDown.get(0).click();
         return this;
    }

    public String getSearchResult(){
        waits.addExplicitWaits(searchResult);
        return searchResult.getText();
    }

}
