package utils;

import appium.AppiumController;
import appium.Hooks;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Print extends AppiumController {

    public static void takeScreenShot(TestInfo info) {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        try {
            screenShot();
            FileUtils.copyFile(scrFile, (new File("./evidence", info.getDisplayName() + ".png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] screenShot(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}