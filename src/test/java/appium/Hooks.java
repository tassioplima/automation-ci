package appium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.Assumptions;
import utils.Print;
import utils.Env;

public class Hooks extends AppiumController{

    @BeforeEach
    public void setUp(TestInfo info) throws Exception {
        // Skip test if required environment variables are not set
        Assumptions.assumeTrue(Env.MOBILE.getEnv() != null && !Env.MOBILE.getEnv().isEmpty(), 
            "MOBILE system property is not set. Skipping Appium test.");
        Assumptions.assumeTrue(Env.RUN.getEnv() != null && !Env.RUN.getEnv().isEmpty(), 
            "RUN system property is not set. Skipping Appium test.");
        startAppium();
    }

    @AfterEach
    public void tearDown(TestInfo info) throws Exception {
      // Only attempt cleanup if driver was initialized
      if (androidDriver != null || iOSDriver != null) {
          Print.takeScreenShot(info);
          Print.screenShot();
          quitDriver();
      }
    }

}
