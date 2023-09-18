import appium.Hooks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.PageWiki;

public class TestWiki extends Hooks{

    public PageWiki pageWiki;

    @BeforeEach
    public void setup(){
        pageWiki = new PageWiki(androidDriver);
    }
    @Test
    @DisplayName("Send information to Wikipedia")
    public void newWiki() {
        pageWiki.clickWiki();
        pageWiki.sendInformation("BrowserStack");
    }

}