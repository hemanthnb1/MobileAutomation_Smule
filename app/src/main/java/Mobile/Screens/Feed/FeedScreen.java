package Mobile.Screens.Feed;

import Mobile.Screens.PlayList.PlayListScreen;
import Mobile.Screens.Waits.driverWaits;

public class FeedScreen  extends FeedLocators{

    driverWaits waits;
    public FeedScreen() {
        this.waits=new driverWaits();
    }

    public FeedScreen clickOnFeedOptions(){
        waits.addExplicitWaits(feedOptions);
        feedOptions.click();
        return this;
    }

    public PlayListScreen addToPlaylist(){
        waits.addExplicitWaits(addToPlayList);
        addToPlayList.click();
        return new PlayListScreen();
    }



}
