package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class PageStatistcs extends PageBase{


    public PageStatistcs(AndroidDriver androidDriver){
        super(androidDriver);
    }

    public PageStatistcs(IOSDriver iosDriver){
        super(iosDriver);
    }
    @AndroidFindBy(accessibility = "Navigate up")
    @iOSXCUITFindBy(accessibility = "element")
    private WebElement navegateMenu;

    @AndroidFindBy(id = "design_menu_item_text")
    @iOSXCUITFindBy(accessibility = "element")
    private WebElement statistics;

    @AndroidFindBy(id = "no_statistics_placeholder")
    @iOSXCUITFindBy(accessibility = "element")
    private WebElement validateStatic;

    public void openMenu(){
        navegateMenu.click();
    }

    public void openStatistics(){
        statistics.click();
    }

    public boolean validationStatic(){
        return validateStatic.isDisplayed();
    }

}