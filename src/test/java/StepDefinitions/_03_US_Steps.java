package StepDefinitions;

import Pages._02_HomePage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

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
    public void theUserClicksOnTheButton(String value) {
        WebElement ValueElement = GWD.getDriver().findElement((By.xpath("//span[contains(text(),'" + value + "')]")));
        ValueElement.click();

    }

    @Then("The {string} page should be displayed")
    public void thePageShouldBeDisplayed(String value) {
        String url = "https://test.mersys.io/user-courses";
        Assert.assertEquals("The page " + url + " is not displayed correctly!",
                url, GWD.getDriver().getCurrentUrl());
    }
    }

