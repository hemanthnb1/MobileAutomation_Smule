package Mobile.Screens.HomePage;

import Mobile.Screens.Waits.driverWaits;

public class HomeScreen extends HomeLocators {

    public HomeScreen skipLocationPermission() throws InterruptedException {
        driverWaits driverWaits = new driverWaits();
        Thread.sleep(3000);
        driverWaits.addExplicitWaits(noThanksBtn).click();
        messageIcon.click();
        return  this;
    }

}
