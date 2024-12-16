package StepDefinitions;

import Pages._02_HomePage;
import Pages._03_HamburgerMenu_Messaging;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class _04_US_Steps {
    public static WebDriverWait wait;
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
    public void theFollowingOptionsShouldBeVisible(List<String>options) {

        for (String option: options){

            WebElement optionElement=GWD.getDriver().findElement(By.xpath("//span[contains(text(),'" + option + "')]"));
            wait.until(ExpectedConditions.elementToBeClickable(optionElement));
            Assert.assertTrue(optionElement.isDisplayed(),option + "is not visible" );
        }

    }







}
