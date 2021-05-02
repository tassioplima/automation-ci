import appium.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.PageNote;
import screens.PageStatistcs;

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
        Assertions.assertTrue(pageNote.getDetailNote().isDisplayed());
        Assertions.assertEquals("New note added", pageNote.getDetailNote().getText());
    }

    @Test
    @DisplayName("Open statistic")
    public void openStatistics() {
        pageStatic = new PageStatistcs(driver);
        pageStatic.getNavigateUp().click();
        pageStatic.getStatistics().click();
        Assertions.assertTrue(pageStatic.getValidateStatic().isDisplayed());
    }
}