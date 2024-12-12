package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
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


    @FindBy(css = "[class='mat-mdc-tooltip-trigger mat-badge mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-unthemed mat-mdc-button-base mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']")
    public WebElement add;

    @FindBy(css = "[class='mat-mdc-form-field-infix ng-tns-c508571215-35']")
    public WebElement message;


    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "Attandance":
                return this.Attandance;
            case "add":
                return this.add;

        }

        return null;
    }
}

