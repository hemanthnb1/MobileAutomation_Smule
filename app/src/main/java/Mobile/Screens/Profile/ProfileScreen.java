package Mobile.Screens.Profile;

import Mobile.Screens.PlayList.PlayListScreen;
import Mobile.Screens.Waits.driverWaits;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProfileScreen extends ProfileLocators{

    driverWaits waits;
    public ProfileScreen(){
        this.waits=new driverWaits();
    }

    public PlayListScreen clickOnPlayListIcon(){
        playListIcon.click();
        return new PlayListScreen();
    }

    public ProfileScreen clickOnHamburgerMenue(){
        hamburgerMenue.click();
        return this;
    }

    public ProfileScreen clickOnSettings(){
        settingsIcon.click();
        return this;
    }

    public String getUserEmail(){
        String userMail=userEmail.getText();
        return userMail;
    }

    public String getUserName(){
        String userNAme=userName.getText();
                return userNAme;
    }
}
