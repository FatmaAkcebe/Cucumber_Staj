package StepDefinitions;

import Pages.Parent;
import Pages._04_HamburgerMenu_Finance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class _09_US_Steps extends Parent {



    _04_HamburgerMenu_Finance hf = new _04_HamburgerMenu_Finance();

    @When("The student click on the {string} link in the Hamburger menu")
    public void theStudentClickOnTheLinkInTheHamburgerMenu(String linkText) {



    }

    @And("The student click on my name to view my payment details")
    public void theStudentClickOnMyNameToViewMyPaymentDetails() {

    }

    @Then("The student should be redirected to the payment page")
    public void theStudentShouldBeRedirectedToThePaymentPage() {

    }

    @And("The student should see the {string} button")
    public void theStudentShouldSeeTheButton(String buttonText) {

    }

    @When("The student click on the {string} button")
    public void theStudentClickOnTheButton(String buttonText) {

    }

    @Then("The student should see the installment details table")
    public void theStudentShouldSeeTheInstallmentDetailsTable() {

    }
}
