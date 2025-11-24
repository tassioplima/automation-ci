package utils;

import appium.AppiumController;
import io.qameta.allure.Attachment;
import org.apache.commons.io.*;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class Print extends AppiumController {

    public static void takeScreenShot(TestInfo info) {
        // Skip screenshot if driver is not initialized
        if (androidDriver == null && iOSDriver == null) {
            return;
        }
        
        try {
            File scrFile;
            // Capture screenshot from the appropriate driver
            if (androidDriver != null) {
                scrFile = androidDriver.getScreenshotAs(OutputType.FILE);
            } else {
                scrFile = iOSDriver.getScreenshotAs(OutputType.FILE);
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
        if (androidDriver == null && iOSDriver == null) {
            result = new byte[0];
            return result;
        }
        
        // Use Android driver if available, otherwise iOS driver
        if (androidDriver != null) {
            result = androidDriver.getScreenshotAs(OutputType.BYTES);
        } else {
            result = iOSDriver.getScreenshotAs(OutputType.BYTES);
        }
        
        return result;
    }

}