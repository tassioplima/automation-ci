package appium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import utils.Print;

public class Hooks extends AppiumController{

    @BeforeEach
    public void setUp(TestInfo info) throws Exception {
        startAppium();
    }

    @AfterEach
    public void tearDown(TestInfo info) throws Exception {
      Print.takeScreenShot(info);
      Print.screenShot();
      quitDriver();
    }

}
