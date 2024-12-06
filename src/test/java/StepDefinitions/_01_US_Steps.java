package StepDefinitions;

import Pages._01_LoginPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_US_Steps {

    _01_LoginPage lp = new _01_LoginPage();

    @Given("Navigate to Campus Website")
    public void navigateToCampusWebsite() {
        GWD.getDriver().get("https://test.mersys.io/");
    }


    @When("User sending keys in Login Page")
    public void userSendingKeysInLoginPage(DataTable dtBoxAndLetters) {
        List<List<String>> boxAndLetters = dtBoxAndLetters.asLists();

        for (int i = 0; i < boxAndLetters.size(); i++) {
            WebElement box = lp.getWebElement(boxAndLetters.get(i).get(0));
            lp.mySendKeys(box, boxAndLetters.get(i).get(1));
        }
    }


    @And("Click on the Element in Login Page")
    public void clickOnTheElementInLoginPage(DataTable dtButtons) {
        List<String> buttons = dtButtons.asList();
        for (int i = 0; i < buttons.size(); i++) {
            lp.myClick(lp.getWebElement(buttons.get(i)));
        }
    }

    @Then("Login Message Should be Displayed")
    public void loginMessageShouldBeDisplayed() {
        lp.verifyMessageContainsText("Welcome");
    }

    @Then("Error Message should be Dislayed")
    public void errorMessageShouldBeDislayed() {
        lp.verifyMessageContainsText("Invalid");


    }



}

