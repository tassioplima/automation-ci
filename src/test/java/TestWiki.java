import appium.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.PageWiki;

public class TestWiki extends Hooks{

    public PageWiki pageWiki;

    @Test
    @DisplayName("Send information to Wikipedia")
    public void newWiki() {
        pageWiki = new PageWiki(driver);
        pageWiki.clickWiki();
        pageWiki.sendInformation("BrowserStack");
    }

}