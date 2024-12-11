package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _06_ProfileFeature extends Parent {


    public _06_ProfileFeature() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[class='ng-fa-icon s-24']")
    public WebElement profile;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settings;

    @FindBy(css = "[class='user-info']")
    public WebElement profilePicture;

    @FindBy(xpath = "//*[text()=' Upload ']")
    public WebElement uploadButton;

    //us15
    @FindBy(css = "[class='ng-tns-c1711764913-32']")
    public WebElement defaultTheme;

    @FindBy(css = "[id^='mat-option']")
    public WebElement selectTheme;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Profile successfully updated']")
    public WebElement successMessage;

}

