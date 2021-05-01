package appium;

import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Print;

public class Hooks extends AppiumController{

    @Before
    public void setUp() throws Exception {
        startAppium();
    }

    @After
    public void tearDown(TestInfo name) throws Exception {
        Print.takeScreenShot(name);
        stopAppium();
    }

}
