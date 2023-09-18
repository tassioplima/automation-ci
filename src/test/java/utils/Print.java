package utils;

import appium.AppiumController;
import io.qameta.allure.Attachment;
import org.apache.commons.io.*;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Print extends AppiumController {

    public static void takeScreenShot(TestInfo info) {
        try {
            // Capture screenshot as a file
            File scrFile = ((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.FILE);

            // Get the byte array of the screenshot
            final byte[] screenshot = ((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.BYTES);

            // Create a directory for storing screenshots if it doesn't exist
            File directory = new File("./evidence");
            if (!directory.exists()) {
                directory.mkdir();
            }

            // Construct the file path with the test method name
            String filePath = String.format("./evidence/%s.png", info.getDisplayName());

            // Save the screenshot with the specified file name
            FileUtils.copyFile(scrFile, new File(filePath));

            // Print a message indicating success
            System.out.println("Screenshot saved: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] screenShot(){
        return ((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.BYTES);
    }

}