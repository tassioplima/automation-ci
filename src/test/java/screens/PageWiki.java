package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PageNote extends PageBase{

    private MobileDriver<MobileElement> driver;

    public PageNote(AppiumDriver driver){
        super(driver);
    }

    @AndroidFindBy(id = "fab_add_notes")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement createNote;

    @AndroidFindBy(id = "toolbar")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement toobarNewnote;

    @AndroidFindBy(id = "add_note_title")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement addNote;

    @AndroidFindBy(id = "fab_add_notes")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement confirmationNote;

    @AndroidFindBy(id = "note_detail_title")
    @iOSXCUITFindBy(accessibility = "element")
    private MobileElement detailNote;


    public void createNewNode(){
        createNote.click();
    }

    public void addNewNote(String value){
        addNote.sendKeys(value);
    }

    public void confirmNote(){
        confirmationNote.click();
    }

    public String validationStringNote(){
        return detailNote.getText();
    }

    public boolean validationNotes(){
        return detailNote.isDisplayed();
    }
}