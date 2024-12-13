package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _03_HamburgerMenu_Messaging extends Parent {


    public _03_HamburgerMenu_Messaging() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@aria-haspopup='menu'])[1]")
    public WebElement HamburgerMenu;
    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messaging;
    @FindBy(xpath = "//span[text()='Send Message']")
    public WebElement sendMessage;
    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement inbox;
    @FindBy(xpath = "//span[text()='Outbox']']")
    public WebElement outbox;
    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement trash;

    @FindBy(xpath = "//*[contains(text(),'Welcome')]")
    public WebElement successmessage;
    @FindBy(xpath = "//*[contains(text(),'Invalid')]")
    public WebElement invalidMessage;


    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "HamburgerMenu": return this.HamburgerMenu;
            case "messaging": return this.messaging;
            case "sendMessage": return this.sendMessage;
            case "inbox": return this.inbox;
            case "outbox": return this.outbox;
            case "trash": return this.trash;


            case "successmessage": return this.successmessage;
            case "invalidMessage": return this.invalidMessage;
        }

        return null;
    }

    public void verifyMessageContainsText(String value) {
        Assert.assertTrue(this.successmessage.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }


}


