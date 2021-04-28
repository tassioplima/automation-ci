package utils;

import appium.Hooks;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commons {

    public static void waitForVisibilityElement(MobileElement mobile) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(mobile));
    }

    public static void waitForVisibilityElement(MobileElement mobile, int time) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, time);
        wait.until(ExpectedConditions.visibilityOf(mobile));
    }

    public static void waitForInvisibilityElement(MobileElement mobile) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, 30);
        wait.until(ExpectedConditions.invisibilityOf(mobile));
    }

    public static void waitForInvisibilityElement(MobileElement mobile, int time) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, time);
        wait.until(ExpectedConditions.invisibilityOf(mobile));
    }

}