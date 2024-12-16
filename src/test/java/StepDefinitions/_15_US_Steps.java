package StepDefinitions;

import Pages._06_ProfileFeature;
import Utilities.GWD;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class _15_US_Steps {

    _06_ProfileFeature pf = new _06_ProfileFeature();

    @When("the student clicks on the {string} dropdown")
    public void theStudentClicksOnTheDropdown(String dropdown) {
        pf.myClick(pf.defaultTheme);
    }

    @When("the student selects a theme from the dropdown")
    public void theStudentSelectsAThemeFromTheDropdown() {

        List<WebElement> options = GWD.getDriver().findElements(By.cssSelector("[id^='mat-option']"));

        Random random = new Random();
        int rdm = random.nextInt(options.size());

        WebElement selectedOption = options.get(rdm);
        selectedOption.click();
    }

    @When("the student clicks on the {string} button")
    public void theStudentClicksOnTheButton(String save) {
        pf.myClick(pf.saveButton);
    }

    @Then("the student should see a {string} message")
    public void theStudentShouldSeeAMessage(String success) {
        pf.verifyMessageContainsText(success);
        String actualMessage = pf.successMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
    }
}



