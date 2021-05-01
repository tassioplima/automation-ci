package utils;

import appium.AppiumController;
import appium.Hooks;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Print extends AppiumController {

    public static void takeScreenShot(TestInfo name) {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        try {
            FileUtils.copyFile(scrFile, (new File("./evidence",  name.getDisplayName() + ".png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}