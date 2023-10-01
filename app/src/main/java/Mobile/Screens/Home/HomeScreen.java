package Mobile.Screens.Home;

import Mobile.Screens.Chatting.ChattingScreen;
import Mobile.Screens.Feed.FeedScreen;
import Mobile.Screens.Profile.ProfileScreen;
import Mobile.Screens.Search.SearchScreen;
import Mobile.Screens.Waits.driverWaits;

public class HomeScreen extends HomeLocators {

    driverWaits waits;
    public  HomeScreen(){
        this.waits=new driverWaits();
    }

    public HomeScreen skipLocationPermission() throws InterruptedException {
        driverWaits driverWaits = new driverWaits();
        Thread.sleep(3000);
        driverWaits.addExplicitWaits(noThanksBtn).click();
        tapOnScreen.click();
        return  this;
    }

    public ProfileScreen clickOnProfileIcon(){
        waits.addExplicitWaits(profileIcon);
        profileIcon.click();
        return new ProfileScreen();
    }

    public SearchScreen clickOnSearchButton(){
        waits.addExplicitWaits(searchBtn);
        searchBtn.click();
        return  new SearchScreen();
    }

    public FeedScreen clickOnFeedIcon(){
        waits.addExplicitWaits(feedBtn);
        feedBtn.click();
        return  new FeedScreen();
    }

    public ChattingScreen clickOnChattingIcon(){
        waits.addExplicitWaits(chatIcon);
        chatIcon.click();
        return new ChattingScreen();
    }

}
