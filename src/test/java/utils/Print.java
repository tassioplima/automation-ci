package utils;

import appium.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.engine.TestExecutionResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Print {

    public static void takeScreenShot(TestInfo name) {

        File scrFile = ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.FILE);
        final byte[] screenshot = ((TakesScreenshot)Hooks.driver).getScreenshotAs(OutputType.BYTES);

        try {
            FileUtils.copyFile(scrFile, (new File("./evidence",  name.getDisplayName())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
