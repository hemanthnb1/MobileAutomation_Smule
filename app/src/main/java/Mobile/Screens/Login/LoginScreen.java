package Mobile.Screens.Login;

import Mobile.Screens.Waits.driverWaits;
import common_utils.ScrollUtils;

public class LoginScreen extends LoginLocators {

        driverWaits driverWaits = new driverWaits();
    public LoginScreen selectLanguage(String lang) throws InterruptedException {
        Thread.sleep(5000);
        ScrollUtils scrollUtils = new ScrollUtils();
        scrollUtils.scrollIntoView(lang);
        LanguageButton.click();
        okButton.click();
        return this;
    }
    public LoginScreen signInUser(String Email, String Password) throws InterruptedException {
        signinButton.click();
        email.sendKeys(Email);
        nextButton.click();
        Thread.sleep(2000);
        driverWaits.addExplicitWaits(password);
        password.sendKeys(Password);
        Thread.sleep(5000);
        nextButton.click();
        return  this;
    }
    public LoginScreen skipPop(){
        driverWaits.addExplicitWaits(skipPopup);
        skipPopup.click();
        return  this;
    }

}
