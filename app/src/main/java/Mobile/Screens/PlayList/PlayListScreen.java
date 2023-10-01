package Mobile.Screens.PlayList;

import Mobile.Screens.Home.HomeScreen;
import Mobile.Screens.Profile.ProfileScreen;
import Mobile.Screens.Waits.driverWaits;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PlayListScreen extends PlayListLocators{

    driverWaits waits;
    public PlayListScreen(){
        this.waits=new driverWaits();
    }

    public HomeScreen selectMyPlayList(){
        waits.addExplicitWaits(myPlaylist);
        myPlaylist.click();
        return new HomeScreen();
    }

    public int getRecordingsInPlaylist(){
        List<WebElement> recordingsList=waits.addExplicitWaitsforListOfElements(recordings);
        return recordingsList.size();
    }
}
