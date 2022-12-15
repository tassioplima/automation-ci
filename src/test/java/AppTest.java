import appium.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.PageNote;
import screens.PageStatistcs;

public class AppTest extends Hooks{

    public PageNote pageNote;
    public PageStatistcs pageStatic;

    @org.junit.jupiter.api.Test
    @DisplayName("Creating new note")
    public void newNote() {
        pageNote = new PageNote(driver);
        pageNote.createNewNode();
        pageNote.addNewNote("New note added");
        pageNote.confirmNote();
        Assertions.assertTrue(pageNote.validationNotes());
        Assertions.assertEquals("New note added", pageNote.validationStringNote());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Open statistic")
    public void openStatistics() {
        pageStatic = new PageStatistcs(driver);
        pageStatic.openMenu();
        pageStatic.openStatistics();
        Assertions.assertTrue(pageStatic.validationStatic());
    }
}