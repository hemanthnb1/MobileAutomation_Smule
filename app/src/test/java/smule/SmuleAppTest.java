package smule;

import Mobile.Screens.Chatting.ChattingScreen;
import Mobile.Screens.Feed.FeedScreen;
import Mobile.Screens.Home.HomeScreen;
import Mobile.Screens.Login.LoginScreen;
import Mobile.Screens.Profile.ProfileScreen;
import Mobile.Screens.Search.SearchScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmuleAppTest extends  BaseTest{

    String userEmail="qwertyhello123@gmail.com";
    String password="1234Qwerty";

    @BeforeMethod
    @Test(groups = "sanity")
    public void loginUser() throws InterruptedException {
        LoginScreen loginScreen = new LoginScreen();
        HomeScreen homeScreen = new HomeScreen();

        loginScreen
                .selectLanguage("English")
                .signInUser(userEmail,password)
                .skipPop();
        homeScreen.skipLocationPermission();

        Assert.assertTrue(homeScreen.searchBtn.isDisplayed());
    }


    @Test(groups = "functional")
    public void searchTest(){
        HomeScreen homeScreen = new HomeScreen();
        SearchScreen searchScreen;


        searchScreen=homeScreen.
                clickOnSearchButton()
                .searchSong("After hours")
                .selectSearchResults();
        Assert.assertEquals(searchScreen.getSearchResult(),"After Hours");
    }



    @Test(groups = "sanity")
    public  void pofileTest(){
        ProfileScreen profileScreen = new ProfileScreen();
        HomeScreen homeScreen = new HomeScreen();
        profileScreen=homeScreen
                .clickOnProfileIcon()
                .clickOnHamburgerMenue()
                .clickOnSettings();
        String email=profileScreen.getUserEmail();
        String username=profileScreen.getUserName();

        Assert.assertEquals(email,email);
        Assert.assertEquals(username,"qwertyhello123");

    }


    @Test(groups = "functional")
    public void feedTest(){
        HomeScreen homeScreen = new HomeScreen();
        FeedScreen feedScreen = new FeedScreen();
        int noOfRecordingsInPlaylist= homeScreen
                 .clickOnFeedIcon()
                .clickOnFeedOptions()
                .addToPlaylist()
                .selectMyPlayList()
                .clickOnProfileIcon()
                .clickOnPlayListIcon()
                .getRecordingsInPlaylist();
        Assert.assertTrue(noOfRecordingsInPlaylist>0);

    }


    @Test(groups = "functional")
    public void chatTest() throws InterruptedException {

        String text="Hey Wassup!!";
        HomeScreen homeScreen = new HomeScreen();
        ChattingScreen chattingScreen = new ChattingScreen();
        chattingScreen=homeScreen
                .clickOnChattingIcon();
        Thread.sleep(10000);
           chattingScreen.clickonNewChat();
        Thread.sleep(10000);
                chattingScreen.searchUser("kbaganna")
                .clickOnUser()
                .clickOnNextBtn()
                .sendChat(text);

        Assert.assertEquals(chattingScreen.getChat(),text);
    }







}
