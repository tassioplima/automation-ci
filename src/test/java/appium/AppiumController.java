package appium;

import java.net.URL;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import utils.AndroidCapabilities;
import utils.ValuesEnum;
import utils.iOSCapabilities;

public class AppiumController {

    public static final String server = "https://" + ValuesEnum.AUTOMATE_USERNAME.getEnv() + ":" + ValuesEnum.AUTOMATE_ACCESS_KEY.getEnv() + "@hub-cloud.browserstack.com/wd/hub";
    public static final String local = "http://127.0.0.1:4723/wd/hub";

    public static AppiumDriver driver;

    public void startAppium() throws Exception {

        if (ValuesEnum.MOBILE.getEnv().equalsIgnoreCase("android")){
            if (ValuesEnum.BOOLENV.getBool()){
                driver = new AppiumDriver<MobileElement>(new URL(server), AndroidCapabilities.getAndroidCapabilities());
            } else {
                driver = new AppiumDriver<MobileElement>(new URL(local), AndroidCapabilities.getAndroidCapabilitiesLocal());
            }

        } else if (ValuesEnum.MOBILE.getEnv().equalsIgnoreCase("ios")){
            if (ValuesEnum.BOOLENV.getBool()){
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