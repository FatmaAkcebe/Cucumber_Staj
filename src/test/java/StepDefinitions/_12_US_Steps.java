package StepDefinitions;

import Pages._04_HamburgerMenu_Finance;
import Utilities.MyFunc;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class _12_US_Steps {

    _04_HamburgerMenu_Finance hf = new _04_HamburgerMenu_Finance();

    Robot rbt;

    public _12_US_Steps() throws AWTException {
        rbt = new Robot();
    }

    @When("The student clicks on the three dot dropdown button on the payment page")
    public void theStudentClicksOnTheThreeDotDropdownButtonOnThePaymentPage() {
        MyFunc.Bekle(5);
        for (int i = 1; i <= 20; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }
        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
    }


    @When("Student chooses a report format \\(Excel or PDF) from the three-dot drop-down menu")
    public void studentChoosesAReportFormatExcelOrPDFFromTheThreeDotDropDownMenu() {

        Random rand = new Random();

        // Random olarak 1 veya 2 seçilecek
        int randomChoice = rand.nextInt(2) + 1;

        if (randomChoice == 1) {
            hf.myClick(hf.excel);
        } else {
            hf.myClick(hf.pdf);
        }

    }
}

