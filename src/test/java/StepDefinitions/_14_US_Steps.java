package StepDefinitions;

import Pages._06_ProfileFeature;
import Utilities.MyFunc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class _14_US_Steps {

    _06_ProfileFeature pf = new _06_ProfileFeature();

    Robot rbt;

    public _14_US_Steps() throws AWTException {
        rbt = new Robot();
    }

    @When("the student clicks on the {string} link")
    public void theStudentClicksOnTheLink(String Profile) {
        pf.myClick(pf.profile);
        pf.myClick(pf.settings);
    }

    @When("the student clicks on the button profile picture")
    public void theStudentClicksOnTheButtons() {
        pf.myClick(pf.profilePicture);
    }

    @And("the student selects the file")
    public void theStudentSelectsTheFile() throws AWTException {

        MyFunc.Bekle(2);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(2);

        StringSelection path = new StringSelection("C:\\Users\\fatma\\Downloads\\Programlama.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);

        MyFunc.Bekle(1);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(5);

    }

    @When("the student click on the button uploud")
    public void theStudentClickOnTheButtonUploud() {
        pf.myClick(pf.uploadButton);
    }


    @When("the student click on the button send")
    public void theStudentClickOnTheButtonSend() {
        MyFunc.Bekle(5);
        pf.myClick(pf.saveButton);
    }


    @Then("the student should see a {string} message.")
    public void theStudentShouldSeeAMessage(String successfully) {
        pf.ContainsText(pf.successMessage, successfully);
        String actualMessage = pf.successMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
    }
}
