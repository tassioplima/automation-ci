package appium;

import java.net.URL;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import utils.AndroidCapabilities;
import utils.Utils;
import utils.iOSCapabilities;

public class AppiumController {

    String mobile = System.getProperty("MOBILE");

    public static final String AUTOMATE_USERNAME = System.getenv("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_ACCESS_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY") ;

    public static String userName = Utils.pathCapabilitie().getUserName();
    public static String accessKey = Utils.pathCapabilitie().getAccessKey();

    public static final String server = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static final String local = "http://127.0.0.1:4723/wd/hub";

    public static AppiumDriver driver;

    public void startAppium() throws Exception {

        if (mobile.toLowerCase().contains("android")){
            if (Boolean.getBoolean("EXEC")){
                System.out.println("AQUI");
                driver = new AppiumDriver<MobileElement>(new URL(server), AndroidCapabilities.getAndroidCapabilities());
            } else {
                System.out.println("LOCAL");
                driver = new AppiumDriver<MobileElement>(new URL(local), AndroidCapabilities.getAndroidCapabilitiesLocal());
            }

        } else if (mobile.toLowerCase().contains("ios")){
            if (Boolean.getBoolean("EXEC")){
                driver = new AppiumDriver<MobileElement>(new URL(server), iOSCapabilities.getIOSCapabilities());
            } else {
                driver = new AppiumDriver<MobileElement>(new URL(local), iOSCapabilities.getIOSCapabilitiesLocal());
            }
        }

    }

    public void stopAppium() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }
}