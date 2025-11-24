package utils;

import appium.AppiumController;
import io.qameta.allure.Attachment;
import org.apache.commons.io.*;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class Print {

    public static void takeScreenShot(TestInfo info) {
        // Skip screenshot if driver is not initialized
        if (AppiumController.androidDriver == null && AppiumController.iOSDriver == null) {
            return;
        }
        
        try {
            File scrFile;
            // Capture screenshot from the appropriate driver
            if (AppiumController.androidDriver != null) {
                scrFile = AppiumController.androidDriver.getScreenshotAs(OutputType.FILE);
            } else {
                scrFile = AppiumController.iOSDriver.getScreenshotAs(OutputType.FILE);
            }

            // Create a directory for storing screenshots if it doesn't exist
            File directory = new File("./evidence");
            if (!directory.exists()) {
                directory.mkdir();
            }

            // Construct the file path with the test method name
            String filePath = "./evidence/%s.png".formatted(info.getDisplayName());

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
        byte[] result;
        
        // Skip screenshot if driver is not initialized
        if (AppiumController.androidDriver == null && AppiumController.iOSDriver == null) {
            result = new byte[0];
            return result;
        }
        
        // Use Android driver if available, otherwise iOS driver
        if (AppiumController.androidDriver != null) {
            result = AppiumController.androidDriver.getScreenshotAs(OutputType.BYTES);
        } else {
            result = AppiumController.iOSDriver.getScreenshotAs(OutputType.BYTES);
        }
        
        return result;
    }

}