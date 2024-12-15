package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _04_HamburgerMenu_Finance extends Parent {


    public _04_HamburgerMenu_Finance() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-bars fa-fw']")
    public WebElement hamburgerMenu;
    public void clickHamburgerMenu() {
        Actions aksiyonlar = new Actions(GWD.getDriver());
        aksiyonlar.moveToElement(hamburgerMenu).perform();
    }


    @FindBy(xpath = "(//div[@class='mat-ripple mat-mdc-menu-ripple'])[2]")
    public WebElement finance;

    @FindBy(xpath = "//*[text()='My Finance']")
    public WebElement myFinance;

     @FindBy(xpath = "//*[@id='mat-tab-group-3-label-0']")
     public WebElement OnlinePayment;

     @FindBy(xpath ="//*[@id='mat-tab-group-5-label-1']")
     public WebElement FeeBalanceDetail;

     @FindBy(xpath ="//* [contains(@style, 'padding-right: 8px') and contains(@style, 'font-weight: 500')]")
     public WebElement StudentName;

     //Student_5 tıklama metodu
     public void clickStudentName(){
         Actions aksiyonlar=new Actions(GWD.getDriver());
         aksiyonlar.moveToElement(StudentName).perform();
     }

             //Online Payment a tıklama metodu
    public void clickOnlinePayment(){
       Actions aksiyonlar=new Actions(GWD.getDriver());
       aksiyonlar.moveToElement(OnlinePayment).perform();
    }

    //Fee/BalanceDetail e tıklama metodu
    public void clickFeeBalanceDetail(){
        Actions aksiyonlar=new Actions(GWD.getDriver());
        aksiyonlar.moveToElement(FeeBalanceDetail).perform();
    }


    // Finance hover yapma
    public void hoverOverFinance() {
        Actions aksiyonlar = new Actions(GWD.getDriver());
        aksiyonlar.moveToElement(finance).perform();
    }

    // "myFinance" seçeneğine tıklama metodu
    public void clickMyFinance() {
        Actions aksiyonlar = new Actions(GWD.getDriver());
        aksiyonlar.moveToElement(myFinance).click().perform();
    }

    @FindBy(xpath = "//student-image[@class='ng-star-inserted']")
    public WebElement clickStudentFees;

    @FindBy(css = "[class='mdc-label']")
    public WebElement clikScripte;

    @FindBy(css = "[class='w-50-p discount-class']")
    public WebElement PayInFull;

    @FindBy(xpath = "//*[text()='Pay']")
    public WebElement pay;

    @FindBy(css = "[placeholder='Amount']")
    public WebElement amount;

    @FindBy(css = "[caption='PAYMENT.FIELD.PAY']")
    public WebElement amountPay;

    @FindBy(id = "Field-numberInput")
    public WebElement cardNumber;

    @FindBy(id = "Field-cvcInput")
    public WebElement cvc;

    @FindBy(id = "payment-message")
    public WebElement payment;

    //US12
    @FindBy(xpath = "//*[text()=' Excel Export ']")
    public WebElement excel;

    @FindBy(xpath = "//*[text()=' Pdf Export ']")
    public WebElement pdf;

    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "student fees":
                return this.clickStudentFees;
            case "scripte":
                return this.clikScripte;
            case "pay in full":
                return this.PayInFull;
            case "pay":
                return this.pay;
            case "amount":
                return this.amount;
            case "amount pay":
                return this.amountPay;
            case "payment":
                return this.payment;


        }

        return null;
    }
}