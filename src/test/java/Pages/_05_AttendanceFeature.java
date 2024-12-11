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


    @FindBy(css = "[tooltip='ATTENDANCE_EXCUSE.TITLE.ADD']")
    public WebElement add;

    @FindBy(css = "[placeholder='Message']")
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

