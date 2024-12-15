package StepDefinitions;

import Pages.Parent;
import Pages._04_HamburgerMenu_Finance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _10_US_Steps extends Parent {

    _04_HamburgerMenu_Finance hf = new _04_HamburgerMenu_Finance();    @Given("The student Total FeeIs")
    public void theStudentTotalFeeIs() {
    }

    @Given("The student Has A Balance Of")
    public void theStudentHasABalanceOf() {
    }

    @When("The student selects the course")
    public void theStudentSelectsTheCourse() {
    }

    @And("The student enters the card number {string}")
    public void theStudentEntersTheCardNumber(String arg0) {
    }

    @And("The student enters a random expiration date and CVV code")
    public void theStudentEntersARandomExpirationDateAndCVVCode() {
    }

    @And("The student confirms the payment of {int}")
    public void theStudentConfirmsThePaymentOf(int arg0) {
    }

    @Then("The student should see the updated balance of {int}")
    public void theStudentShouldSeeTheUpdatedBalanceOf(int arg0) {
    }
}
