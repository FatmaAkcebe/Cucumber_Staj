package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _05_AttendanceFeature extends Parent {

    public _05_AttendanceFeature() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[page='ATTENDANCE']")
    public WebElement Attandance;

    @FindBy(xpath = "//*[text()=' ATTENDANCE EXCUSES ']")
    public WebElement AttandanceExcecuses;


    @FindBy(xpath = "(//button[contains(@class, 'mat-badge')])[last()]")
    public WebElement add;

    @FindBy(xpath = "//*[contains(@class, 'mat-mdc-form-field-icon-suffix')]")
    public WebElement dateButton;

    @FindBy(css = "[aria-label='Dec 19, 2024']")
    public WebElement daySelect;

    @FindBy(css = "ms-textarea-field textarea")
    public WebElement message;

    @FindBy(xpath = "//span[text()='Attach Files...']")
    public WebElement attachFile;

    @FindBy(xpath = "//span[text()='From Local']")
    public WebElement fromLocal;


    @FindBy(xpath = "//button[@mat-button]//span[text()='Send']")
    public WebElement sendButton;


    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "Attandance":
                return this.Attandance;

        }

        return null;
    }
}

