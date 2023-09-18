package utils;

import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class iOSCapabilities {

    public static XCUITestOptions getiOSXCUITestCap(){
        XCUITestOptions xcuiTestOptions = new XCUITestOptions().setPlatformName("iOS").setAutomationName("XCUITest").amend("device",Utils.pathCapabilitie().getDevices()[1]).amend("os_version",Utils.pathCapabilitie().getOSVersions()[1]).
                amend("project","iOS Project").amend("build","Automation").amend("name","iOS").
                amend("app",Utils.pathCapabilitie().getApps()[1]).amend("deviceName",Utils.pathCapabilitie().getDevices()[1]);
        return xcuiTestOptions;
    }

    public static DesiredCapabilities getIOSCapabilities(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("device", Utils.pathCapabilitie().getDevices()[1]);
        caps.setCapability("os_version", Utils.pathCapabilitie().getOSVersions()[1]);
        caps.setCapability("project", "iOS Project");
        caps.setCapability("build", "Automation");
        caps.setCapability("name", "iOS");
        caps.setCapability("app", Utils.pathCapabilitie().getApps()[1]);
        caps.setCapability("browserstack.video", true);
        caps.setCapability("browserstack.debug", true);
        return caps;
    }

    public static DesiredCapabilities getIOSCapabilitiesLocal(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        caps.setCapability(MobileCapabilityType.UDID,Utils.pathCapabilitieLocal().getUdid() );
        return caps;
    }
}