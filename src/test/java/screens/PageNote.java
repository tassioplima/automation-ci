package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class PageNote extends PageBase{

    public PageNote(AndroidDriver androidDriver){
        super(androidDriver);
    }

    public PageNote(IOSDriver iosDriver){
        super(iosDriver);
    }

    @AndroidFindBy(id = "fab_add_notes")
    @iOSXCUITFindBy(accessibility = "element")
    private WebElement createNote;

    @AndroidFindBy(id = "toolbar")
    @iOSXCUITFindBy(accessibility = "element")
    private WebElement toolbarNewnote;

    @AndroidFindBy(id = "add_note_title")
    @iOSXCUITFindBy(accessibility = "element")
    private WebElement addNote;

    @AndroidFindBy(id = "fab_add_notes")
    @iOSXCUITFindBy(accessibility = "element")
    private WebElement confirmationNote;

    @AndroidFindBy(id = "note_detail_title")
    @iOSXCUITFindBy(accessibility = "element")
    private WebElement detailNote;


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