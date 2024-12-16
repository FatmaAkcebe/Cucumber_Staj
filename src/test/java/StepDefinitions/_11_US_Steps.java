package StepDefinitions;

import Pages._04_HamburgerMenu_Finance;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _11_US_Steps {

    _04_HamburgerMenu_Finance hf = new _04_HamburgerMenu_Finance();

    @And("the user follows the link {string}")
    public void theUserFollowsTheLink(String menu) {
        wait.until(ExpectedConditions.visibilityOf(hf.hamburgerMenu));
        hf.myClick(hf.hamburgerMenu);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-menu-panel-4"))); // Alt menünün görünmesini bekle
        hf.hoverOverFinance();
        hf.clickMyFinance();
    }

    @When("the student clicks on the option")
    public void theStudentClicksOnTheStudentFeesOption(DataTable dtButtons) {
        List<String> buttons = dtButtons.asList();
        for (int i = 0; i < buttons.size(); i++) {
            hf.myClick(hf.getWebElement(buttons.get(i)));
        }
    }

    @When("the student clicks on the button")
    public void theStudentClicksOnTheButton(DataTable dtButtons) {
        List<String> buttons = dtButtons.asList();
        for (int i = 0; i < buttons.size(); i++) {
            hf.myClick(hf.getWebElement(buttons.get(i)));
        }
    }
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    @When("the student enters the amount he will pay")
    public void theStudentEntersTheAmountHeWillPay(DataTable dtBoxAndLetters) {
        List<List<String>> boxAndLetters = dtBoxAndLetters.asLists();
        for (int i = 0; i < boxAndLetters.size(); i++) {
            WebElement box = hf.getWebElement(boxAndLetters.get(i).get(0));
            hf.mySendKeys(box, boxAndLetters.get(i).get(1));
        }
    }

    @When("the student clicks on the button twice")
    public void theStudentClicksTheButtonTwice(String buttonName) {

        WebElement button = hf.getWebElement(buttonName);
        button.click();
        // İkinci tıklama
        button.click();
    }


Robot rbt;

    public _11_US_Steps() throws AWTException {
        rbt = new Robot();
    }

    @When("the student enters the amount he will paay")
    public void theStudentEntersTheAmountHeWillPaay() {
        MyFunc.Bekle(10);


        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        MyFunc.Bekle(1);

        String cardNumber = "4242 4242 4242 4242";
        for (char digit : cardNumber.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(digit); // Karakteri keyCode'a dönüştürme
            rbt.keyPress(keyCode);
            rbt.keyRelease(keyCode);
        }

        MyFunc.Bekle(1);


        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        MyFunc.Bekle(1);


        String cardExpiry = "1225";
        for (char digit : cardExpiry.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(digit);
            rbt.keyPress(keyCode);
            rbt.keyRelease(keyCode);
        }

        MyFunc.Bekle(1);


        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        MyFunc.Bekle(1);


        String cardCVV = "2222";
        for (char digit : cardCVV.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(digit);
            rbt.keyPress(keyCode);
            rbt.keyRelease(keyCode);
        }

        MyFunc.Bekle(1);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        MyFunc.Bekle(1);


        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        MyFunc.Bekle(1);


        String zipCode = "44444";
        for (char digit : zipCode.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(digit);
            rbt.keyPress(keyCode);
            rbt.keyRelease(keyCode);
        }

        MyFunc.Bekle(1);


        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        MyFunc.Bekle(1);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(2);


    }


    @When("clickSaveOnWindowsDialog select")
    public void clicksaveonwindowsdialogSelect() {
        MyFunc.Bekle(2);
        GWD.getDriver().switchTo().alert().accept();

    }


    @Then("the student should see {string} message.")
    public void theStudentShouldSeeMessage(String successfully) {
        hf.ContainsText(hf.successMessage, successfully);
        String actualMessage = hf.successMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
    }
}







