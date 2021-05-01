package appium;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInfo;
import utils.Print;

public class Hooks extends AppiumController{

    @Before
    public void setUp() throws Exception {
        startAppium();
    }

    @AfterAll
    public void tearDown(TestInfo name) throws Exception {
        Print.takeScreenShot(name);
        stopAppium();
    }

}
