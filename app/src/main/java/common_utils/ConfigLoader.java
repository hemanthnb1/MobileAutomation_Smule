package common_utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;
public class ConfigLoader {

    public static Map getCapability(){
        JsonPath jsonPath=null;
        String path=System.getProperty("user.dir")+new FilePaths().capabilityPath;
        try {
            jsonPath=new JsonPath(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return jsonPath.getMap(".");
    }

//    public static void main(String[] args) throws MalformedURLException {
//        AppiumDriver androidDriver=null;
//        Map<String,String>map=getCapability();
//        System.out.println(map);
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities(getCapability());
//        androidDriver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
//    }
}
