package utils;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class iOSCapabilities {

    public static DesiredCapabilities getIOSCapabilities(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("device", Utils.pathToJSON().getDevices()[1]);
        caps.setCapability("os_version", Utils.pathToJSON().getOSVersions()[1]);
        caps.setCapability("project", "iOS Project");
        caps.setCapability("build", "Automation");
        caps.setCapability("name", "iOS");
        caps.setCapability("app", Utils.pathToJSON().getApps()[1]);
        return caps;
    }

    public static DesiredCapabilities getIOSCapabilitiesLocal(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        caps.setCapability(MobileCapabilityType.UDID,Utils.pathCapabilitieLocal().getUdid() );
        caps.setCapability("app", Utils.pathToJSON().getAppLocal()[1]);
        return caps;
    }
}
