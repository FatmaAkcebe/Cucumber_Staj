package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _01_LoginPage extends Parent {

    public _01_LoginPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Kullanıcı Adı']")
    public WebElement username;
    @FindBy(css = "input[placeholder='Parola']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(css = "[class='username mr-12']")
    public WebElement profileSettings;
    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement SignOut;

    @FindBy(xpath = "//*[contains(text(),'Welcome')]")
    public WebElement successmessage;
    @FindBy(xpath = "//*[contains(text(),'Invalid')]")
    public WebElement invalidMessage;


    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "username": return this.username;
            case "password": return this.password;
            case "loginButton": return this.loginButton;
            case "profileSettings": return this.profileSettings;
            case "SignOut": return this.SignOut;


            case "successmessage": return this.successmessage;
            case "invalidMessage": return this.invalidMessage;
        }

        return null;
    }
    public void verifyMessageContainsText(String value){
        Assert.assertTrue( this.successmessage.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }

}
