package utils;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class AndroidCapabilities {

    public static UiAutomator2Options getAndroidUiAutomatorCap(){
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options().setPlatformName("Android").setAutomationName("UiAutomator2").amend("device",Utils.pathCapabilitie().getDevices()[0]).amend("os_version",Utils.pathCapabilitie().getOSVersions()[0]).
                amend("project","Android Project").amend("build","Automation").amend("name","Android").
                amend("app",Utils.pathCapabilitie().getApps()[0]).amend("deviceName",Utils.pathCapabilitie().getDevices()[0]);
        return uiAutomator2Options;
    }
    public static DesiredCapabilities getAndroidCapabilities(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("device", Utils.pathCapabilitie().getDevices()[0]);
        caps.setCapability("os_version", Utils.pathCapabilitie().getOSVersions()[0]);
        caps.setCapability("project", "Android Project");
        caps.setCapability("build", "Automation");
        caps.setCapability("name", "Android");
        caps.setCapability("app", Utils.pathCapabilitie().getApps()[0]);
        caps.setCapability("browserstack.video", true);
        caps.setCapability("browserstack.debug", true);
        return caps;
    }

    public static DesiredCapabilities getAndroidCapabilitiesLocal(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, Utils.pathCapabilitieLocal().getAppPackage());
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, Utils.pathCapabilitieLocal().getAppActivity());
        caps.setCapability(MobileCapabilityType.UDID,Utils.pathCapabilitieLocal().getUdid() );
        return caps;
    }
}