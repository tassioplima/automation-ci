package utils;

import appium.Hooks;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Print extends Hooks {

    public static void takeScreenShot(DisplayName name) {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        try {
            FileUtils.copyFile(scrFile, (new File("./evidence",  name.value())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
