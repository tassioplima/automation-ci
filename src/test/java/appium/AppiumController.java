package appium;

import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import utils.AndroidCapabilities;
import utils.Env;
import utils.Utils;
import utils.iOSCapabilities;

public class AppiumController {
    public static final String server = "https://" + Env.AUTOMATE_USERNAME.getEnv() + ":" + Env.AUTOMATE_ACCESS_KEY.getEnv() + "@hub-cloud.browserstack.com/wd/hub";
    public static final String farm = "https://" + Utils.pathCapabilitie().getUserName() + ":" + Utils.pathCapabilitie().getAccessKey() + "@hub-cloud.browserstack.com/wd/hub";
    public static final String local = "http://127.0.0.1:4723/";
    public static AndroidDriver androidDriver;
    public static IOSDriver iOSDriver;

    public void startAppium() throws Exception{
        if (Env.MOBILE.getEnv().equalsIgnoreCase("android")) {
            switch(Env.RUN.getEnv()){
                case "local":
                    androidDriver = new AndroidDriver(new URL(local), AndroidCapabilities.getAndroidCapabilitiesLocal());
                    break;
                case "remote":
                    androidDriver = new AndroidDriver(new URL(server), AndroidCapabilities.getAndroidUiAutomatorCap());
                    break;
                case "farm":
                    androidDriver = new AndroidDriver(new URL(farm), AndroidCapabilities.getAndroidUiAutomatorCap());
                    break;
            }
        } else if (Env.MOBILE.getEnv().equalsIgnoreCase("ios")) {
            switch (Env.RUN.getEnv()) {
                case "local":
                    iOSDriver = new IOSDriver(new URL(local), iOSCapabilities.getIOSCapabilitiesLocal());
                    break;
                case "remote":
                    iOSDriver = new IOSDriver(new URL(server), iOSCapabilities.getiOSXCUITestCap());
                    break;
                case "farm":
                    iOSDriver = new IOSDriver(new URL(farm), iOSCapabilities.getiOSXCUITestCap());
                    break;
            }
        }
    }

    public static void quitDriver()  throws Exception{
        if (Env.MOBILE.getEnv().equalsIgnoreCase("android") && androidDriver != null) {
            androidDriver.quit();
        } else if (Env.MOBILE.getEnv().equalsIgnoreCase("ios") && iOSDriver != null) {
            iOSDriver.quit();
        }
    }
}