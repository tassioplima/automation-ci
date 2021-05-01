package appium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Hooks extends AppiumController{

    @BeforeEach
    public void setUp() throws Exception {
        startAppium();
    }

    @AfterEach
    public void tearDown() throws Exception {
      //Print.takeScreenShot(name);
        System.out.println("DESPOIS TUDO");
        stopAppium();
    }

}