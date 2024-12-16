package StepDefinitions;

import Pages._02_HomePage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _03_US_Steps {

    _02_HomePage hp=new _02_HomePage();

    @Then("The user should see the following menu items:")
    public void theUserShouldSeeTheFollowingMenuItems(List<String>menuItems) {

        for (String item : menuItems) {
            WebElement menuItem = GWD.getDriver().findElement(By.xpath("//span[contains(text(),'" + item + "')]"));
            Assert.assertTrue(menuItem.isDisplayed(),"Menu item " + item + " is not visible!");
        }

    }

    @When("The user clicks on the {string} button")
    public void theUserClicksOnTheButton(String button) {
        WebElement buttonElement = GWD.getDriver().findElement
                                                    (By.xpath("//span[contains(text(),'" + button + "')]"));
        hp.myClick(buttonElement);

        new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlContains(button.toLowerCase()));

    }

    @Then("The {string} page should be displayed")
    public void thePageShouldBeDisplayed(String page) {

            String currentUrl = GWD.getDriver().getCurrentUrl();

            Assert.assertTrue(
                    currentUrl.toLowerCase().contains(page.toLowerCase()),
                    "The url does not contain the expected page name"+ page);



    }
}

