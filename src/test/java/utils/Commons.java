package utils;

import appium.AppiumController;
import appium.Hooks;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.*;

public class Commons extends AppiumController {
    
    public static final int DEFAULT_TIMEOUT = 25;

    public static void waitForVisibilityElement(MobileElement mobile) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(mobile));
    }

    public static void waitForVisibilityElement(MobileElement mobile, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(mobile));
    }

    public static void waitForInvisibilityElement(MobileElement mobile) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOf(mobile));
    }

    public static void waitForInvisibilityElement(MobileElement mobile, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOf(mobile));
    }
    
      /*
     * Automation method for scrolling down only
     *
     */
    public void scrollDown() {
        try {
            Dimension dimensions = driver.manage().window().getSize();
            double screenHeightStart = dimensions.getHeight() * 0.5;
            int scrollStart = (int) screenHeightStart;
            double screenHeightEnd = dimensions.getHeight() * 0.2;
            int scrollEnd = (int) screenHeightEnd;
            TouchAction touchAction = new TouchAction(driver);
            touchAction.longPress(PointOption.point(0, scrollStart)).moveTo(PointOption.point(0, scrollEnd)).release()
                    .perform();
        } catch (NullPointerException e) {
            fail(e.getMessage());
        }
    }
    
     /*

     * Automation method for scroll only by Mobile Element

     *

     * @param element MobileElement of element

     */

    public void scrollAndFindElement(MobileElement element) {
        int limit = 0;
        while (!elementIsDisplayed(element)){
            limit ++;
            scrollDown();
            if (limit >= DEFAULT_SCROLL_COUNT){
                break;
            }
        }
    }
    
    /*

     * Automation method to return boolean if the element is displayed

     *

     * @param element MobileElement of element

     */

    public boolean elementIsDisplayed(MobileElement element) {
        try {
             element.isDisplayed();
             return true;
        } catch (Exception e){
            return false;
        }
    }
  
}
