package StepDefinitions;

import Pages._02_HomePage;
import Pages._03_HamburgerMenu_Messaging;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _04_US_Steps {
    _03_HamburgerMenu_Messaging hm=new _03_HamburgerMenu_Messaging();

    @When("Click on the Element in Hamburger Menu")
    public void clickOnTheElementInHamburgerMenu(DataTable dtButtons) {
        List<String> buttons = dtButtons.asList();
        for (int i = 0; i < buttons.size(); i++) {
            hm.myClick(hm.getWebElement(buttons.get(i)));
        }

    }


    @And("Hover over the {string} link in he Hamburger Menu")
    public void hoverOverTheLinkInHeHamburgerMenu(String menuLink) {


        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(hm.HamburgerMenu).build().perform();


    }

    @Then("The following options should be visible")
    public void theFollowingOptionsShouldBeVisible() {

    }
}
