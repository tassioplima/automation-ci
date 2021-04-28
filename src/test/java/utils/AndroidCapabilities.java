package utils;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidCapabilities {

    public static DesiredCapabilities getAndroidCapabilities(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("device", Utils.pathToJSON().getDevices()[0]);
        caps.setCapability("os_version", Utils.pathToJSON().getOSVersions()[0]);
        caps.setCapability("project", "Android Project");
        caps.setCapability("build", "Automation");
        caps.setCapability("name", "Android");
        caps.setCapability("app", Utils.pathToJSON().getApps()[0]);
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