package Mobile.Screens.Chatting;

import Mobile.Screens.Waits.driverWaits;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChattingScreen extends  ChattingLocators{
         driverWaits waits;

         public ChattingScreen(){
             this.waits=new driverWaits();
         }


         public ChattingScreen clickonNewChat(){
             newChatIcon.click();
             return this;
         }
    public ChattingScreen searchUser(String user){
             waits.addExplicitWaits(searchUserInputBox);
        searchUserInputBox.click();
        searchUserInputBox.sendKeys(user);
        return this;
    }

    public ChattingScreen clickOnUser(){
        waits.addExplicitWaits(user);
        user.click();
        return  this;
    }

    public ChattingScreen clickOnNextBtn(){
             forwardChatButton.click();
             return this;
    }

    public ChattingScreen sendChat(String message){
             waits.addExplicitWaits(chatInputBox);
             chatInputBox.click();
             chatInputBox.sendKeys(message);
             sendBtn.click();
             return this;
    }

    public String getChat(){
             waits.addExplicitWaitsforListOfElements(chatHistory);
        List<WebElement> chats =chatHistory;
        return chats.get(chats.size()-1).getText();
    }



}
