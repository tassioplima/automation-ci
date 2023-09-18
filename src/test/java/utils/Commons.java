package utils;

import appium.AppiumController;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.*;

import java.time.Duration;

public class Commons extends AppiumController {
    
    public static final int DEFAULT_SCROLL_COUNT = 15;
    public static Duration duration = Duration.ofSeconds(30);

    public static void waitForVisibilityElement(WebElement mobile) {
        WebDriverWait wait = new WebDriverWait(androidDriver, duration);
        wait.until(ExpectedConditions.visibilityOf(mobile));
    }

    public static void waitForVisibilityElement(WebElement mobile, int time) {
        WebDriverWait wait = new WebDriverWait(androidDriver, duration);
        wait.until(ExpectedConditions.visibilityOf(mobile));
    }

    public static void waitForInvisibilityElement(WebElement mobile) {
        WebDriverWait wait = new WebDriverWait(androidDriver, duration);
        wait.until(ExpectedConditions.invisibilityOf(mobile));
    }

    public static void waitForInvisibilityElement(WebElement mobile, int time) {
        WebDriverWait wait = new WebDriverWait(androidDriver, duration);
        wait.until(ExpectedConditions.invisibilityOf(mobile));
    }
    
     /*
     * Automation method for scrolling down only
     */
    public void scrollDown() {
        try {
            Dimension dimensions = androidDriver.manage().window().getSize();
            double screenHeightStart = dimensions.getHeight() * 0.5;
            int scrollStart = (int) screenHeightStart;
            double screenHeightEnd = dimensions.getHeight() * 0.2;
            int scrollEnd = (int) screenHeightEnd;
            TouchAction touchAction = new TouchAction(androidDriver);
            touchAction.longPress(PointOption.point(0, scrollStart)).moveTo(PointOption.point(0, scrollEnd)).release()
                    .perform();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    
     /*
     * Automation method for scroll only by Mobile Element
     * @param element MobileElement of element
     */

    public void scrollAndFindElement(WebElement element) {
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
     * @param element MobileElement of element
     */

    public boolean elementIsDisplayed(WebElement element) {
        try {
             element.isDisplayed();
             return true;
        } catch (Exception e){
            return false;
        }
    }
  
}
