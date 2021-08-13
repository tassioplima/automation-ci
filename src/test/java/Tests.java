import appium.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.PageNote;
import screens.PageStatistcs;
import utils.Utils;

public class Tests extends Hooks{

    public PageNote pageNote;
    public PageStatistcs pageStatic;

    @Test
    @DisplayName("Creating new note")
    public void newNote() {
        pageNote = new PageNote(driver);
        pageNote.createNewNode();
        pageNote.addNewNote("New note added");
        pageNote.confirmNote();
        System.out.println( "SYS OUT TEST "+ Utils.pathCapabilitie().getEnvironment()[0].getDevices() +"  " + "  "+ Utils.pathCapabilitie().getEnvironment()[0].getOSVersions() );
        Assertions.assertTrue(pageNote.validationNotes());
        Assertions.assertEquals("New note added", pageNote.validationStringNote());
    }

    @Test
    @DisplayName("Open statistic")
    public void openStatistics() {
        pageStatic = new PageStatistcs(driver);
        pageStatic.openMenu();
        pageStatic.openStatistics();
        System.out.println( "SYS OUT TEST "+ Utils.pathCapabilitie().getEnvironment()[0].getDevices() +"  " + "  "+ Utils.pathCapabilitie().getEnvironment()[0].getOSVersions() );
        Assertions.assertTrue(pageStatic.validationStatic());
    }
}