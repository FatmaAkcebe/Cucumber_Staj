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

    @FindBy(css = "[placeholder='Kullanıcı Adı']")
    public WebElement username;
    @FindBy(css = "[placeholder='Parola']")
    public WebElement password;
    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[contains(text(),'Welcome')]")
    public WebElement successmessage;

    @FindBy(css = "[class='avatar-mini ng-star-inserted']")
    public WebElement profil;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut;

    @FindBy(xpath = "//div[@class='ng-star-inserted']/img")
    public WebElement logo;



    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "username": return this.username;
            case "password": return this.password;
            case "loginButton": return this.loginButton;
            case "successmessage": return this.successmessage;
            case "profil": return this.profil;
            case "signOut": return this.signOut;
            case "logo": return this.logo;
        }

        return null;
    }
    public void verifyMessageContainsText(String value){
        Assert.assertTrue( this.successmessage.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }

}
