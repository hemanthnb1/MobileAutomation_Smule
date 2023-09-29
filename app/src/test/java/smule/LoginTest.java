package smule;

import Mobile.Screens.HomePage.HomeScreen;
import Mobile.Screens.Login.LoginScreen;
import Mobile.Screens.Search.SearchScreen;
import org.testng.annotations.Test;

public class LoginTest extends  BaseTest{

    @Test(priority = 0)
    public void loginUser() throws InterruptedException {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen
                .selectLanguage("English")
                .signInUser("qwertyhello123@gmail.com","1234Qwerty")
                .skipPop();
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.skipLocationPermission();
    }


//    @Test(priority = 1)
//    public  void sendMessages(){
//        HomeScreen homeScreen = new HomeScreen();
//        homeScreen.skipLocationPermission();
//    }

    @Test(priority = 1)
    public void searchTest(){
        SearchScreen searchScreen = new SearchScreen();
        searchScreen
                .searchSong("all of me");
        System.out.println(searchScreen.getSearchResults());
    }
}
