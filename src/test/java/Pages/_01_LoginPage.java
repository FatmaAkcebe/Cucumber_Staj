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

    @FindBy(css = "[placeholder='Username']")
    public WebElement username;
    @FindBy(css = "[placeholder='Password']")
    public WebElement password;
    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[contains(text(),'Welcome')]")
    public WebElement successmessage;




    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "username": return this.username;
            case "password": return this.password;
            case "loginButton": return this.loginButton;


            case "successmessage": return this.successmessage;
        }

        return null;
    }
    public void verifyMessageContainsText(String value){
        Assert.assertTrue( this.successmessage.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }

}
