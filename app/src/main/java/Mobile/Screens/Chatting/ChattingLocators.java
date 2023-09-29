package Mobile.Screens.Chatting;

import Mobile.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ChattingLocators extends BasePage {

    //    com.smule.singandroid:id/messageIcon

//    com.smule.singandroid:id/action_message_center
//    com.smule.singandroid:id/messageIcon
//    new Chat icon  com.smule.singandroid:id/start_new_chat_icon
//    searchbar com.smule.singandroid:id/search_edit_text
//    kbaganna com.smule.singandroid:id/chat_title
//    nest->arraow  com.smule.singandroid:id/new_chat_forward_chat

//      com.smule.singandroid:id/inputBox
//      com.smule.singandroid:id/inputBox
    // com.smule.singandroid:id/send_button send button

    ChattingLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(id = " com.smule.singandroid:id/messageIcon")
    public WebElement messageIcon;


}
