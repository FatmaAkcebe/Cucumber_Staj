package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _07_GradingFeature extends Parent {

    public _07_GradingFeature() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(css = "[id='trash-link']")
    public WebElement trashLink;

    @FindBy(css = "[class='deleted-messages']")
    public WebElement deletedMessagesList;

    @FindBy(css = "[class='delete-icon']")
    public WebElement deleteIcon;

    @FindBy(css = "[class='restore-icon']")
    public WebElement restoreIcon;

    @FindBy(css = "[class='success-message']")
    public WebElement successMessage;

    @FindBy(css = "[class='confirmation-popup']")
    public WebElement confirmationPopup;
}
