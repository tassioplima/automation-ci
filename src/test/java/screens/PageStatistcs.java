package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PageStatistcs extends PageBase{

    private MobileDriver<MobileElement> driver;

    public PageStatistcs(AppiumDriver driver){
        super(driver);
    }

    @AndroidFindBy(accessibility = "Navigate up")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement navegateMenu;

    @AndroidFindBy(id = "design_menu_item_text")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement statistics;

    @AndroidFindBy(id = "no_statistics_placeholder")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement validateStatic;

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