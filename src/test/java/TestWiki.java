import appium.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import screens.PageNote;
import screens.PageStatistcs;
import screens.PageWiki;

public class TestWiki extends Hooks{

    public PageWiki pageWiki;

    @Test
    @DisplayName("Send information to Wikipedia")
    public void newWiki() {
        pageWiki = new PageWiki(driver);
        pageWiki.clickWiki();
        pageWiki.sendInformation("BrowserStack");
        pageWiki.validateButton();
    }

}