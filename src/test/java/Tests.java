import appium.AppiumController;
import appium.Hooks;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import screens.PageNote;
import screens.PageStatistcs;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class Tests extends Hooks{

    public PageNote pageNote;
    public PageStatistcs pageStatic;

    @Test
    @DisplayName("Creating new note")
    public void newNote() {
        pageNote = new PageNote(driver);
        pageNote.createNote().click();
        pageNote.getAddNote().sendKeys("New note added");
        pageNote.getConfirmationNote().click();
        assertTrue("New note added not avaliable", pageNote.getDetailNote().isDisplayed());
        assertEquals("New note added", pageNote.getDetailNote().getText());
    }

    @Test
    @DisplayName("Open statistic")
    public void openStatistics() {
        pageStatic = new PageStatistcs(driver);
        pageStatic.getNavigateUp().click();
        pageStatic.getStatistics().click();
        assertTrue(pageStatic.getValidateStatic().isDisplayed());
    }
}
