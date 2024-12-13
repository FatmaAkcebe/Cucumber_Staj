package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _02_HomePage extends Parent {

    public _02_HomePage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='ng-star-inserted']/img")
    public WebElement Logo;
    @FindBy(css = "[page='COURSES'")
    public WebElement Courses;

    @FindBy(css = "[page='CALENDAR']")
    public WebElement Calendar;

    @FindBy(css = "[page='ATTENDANCE']")
    public WebElement Attendance;

    @FindBy(css = "[page='ASSIGNMENT']")
    public WebElement Assignments;
    @FindBy(css = "[page='GRADING']")
    public WebElement Grading;
    @FindBy(xpath = "(//*[@aria-haspopup='menu'])[1]")
    public WebElement HamburgerMenu;


    @FindBy(xpath = "//*[contains(text(),'Welcome')]")
    public WebElement successmessage;


    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "Logo":
                return this.Logo;
            case "Courses":
                return this.Courses;
            case "Calendar":
                return this.Calendar;
            case "Attendance":
                return this.Attendance;
            case "Assignments":
                return this.Assignments;
            case "Grading":
                return this.Grading;
            case "HamburgerMenu":
                return this.HamburgerMenu;


            case "successmessage":
                return this.successmessage;
        }

        return null;
    }

    public void verifyMessageContainsText(String value) {
        Assert.assertTrue(this.successmessage.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }


}
