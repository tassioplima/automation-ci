package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class PageWiki extends PageBase{

    public PageWiki(AndroidDriver androidDriver){
        super(androidDriver);
    }
    public PageWiki(IOSDriver iosDriver){
        super(iosDriver);
    }

    @AndroidFindBy(accessibility = "Search Wikipedia")
    @iOSXCUITFindBy(accessibility = "Text Button")
    private WebElement clickWiki;

    @AndroidFindBy(id = "org.wikipedia.alpha:id/search_src_text")
    @iOSXCUITFindBy(accessibility = "Text Input")
    private WebElement sendInformation;

    public void clickWiki(){
        clickWiki.click();
    }

    public void sendInformation(String value){
        sendInformation.sendKeys(value);
    }

    public void validateButton() {
        clickWiki.isDisplayed();
    }

}