package appium;

import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks extends AppiumController{

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

    @Before
    public void setUp() throws Exception {
        startAppium();
    }

    @After
    public void tearDown() throws Exception {
        stopAppium();
    }

}
