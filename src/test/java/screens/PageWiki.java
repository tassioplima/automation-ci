package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PageWiki extends PageBase{

    private MobileDriver<MobileElement> driver;

    public PageWiki(AppiumDriver driver){
        super(driver);
    }

    @AndroidFindBy(accessibility = "Search Wikipedia")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement clickWiki;

    @AndroidFindBy(id = "org.wikipedia.alpha:id/search_src_text")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement sendInformation;

    public void clickWiki(){
        clickWiki.click();
    }

    public void sendInformation(String value){
        sendInformation.sendKeys(value);
    }

}