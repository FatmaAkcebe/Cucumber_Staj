package StepDefinitions;

import Pages._03_HamburgerMenu_Messaging;
import Pages._06_ProfileFeature;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _06_US_Steps {
    _03_HamburgerMenu_Messaging hm = new _03_HamburgerMenu_Messaging();


    public class ProfileFeatureSteps {

        _06_ProfileFeature profilePage = new _06_ProfileFeature();

        @When("the user clicks on the Profile icon")
        public void theUserClicksOnTheProfileIcon() {
            profilePage.profile.click();
            System.out.println("Profile icon clicked.");
        }

        @When("the user clicks on the Settings option")
        public void theUserClicksOnTheSettingsOption() {
            profilePage.settings.click();
            System.out.println("Settings option clicked.");
        }

        @Then("the user should see the Profile Picture")
        public void theUserShouldSeeTheProfilePicture() {
            Assert.assertTrue(profilePage.profilePicture.isDisplayed(), "Profile Picture is not displayed!");
            System.out.println("Profile Picture is displayed.");
        }

        @When("the user clicks on the Upload button")
        public void theUserClicksOnTheUploadButton() {
            profilePage.uploadButton.click();
            System.out.println("Upload button clicked.");
        }

        @When("the user clicks on the Default Theme option")
        public void theUserClicksOnTheDefaultThemeOption() {
            profilePage.defaultTheme.click();
            System.out.println("Default Theme option clicked.");
        }

        @When("the user selects a Theme from the options")
        public void theUserSelectsAThemeFromTheOptions() {
            profilePage.selectTheme.click();
            System.out.println("A theme was selected.");
        }

        @Then("the user clicks on the Save button")
        public void theUserClicksOnTheSaveButton() {
            profilePage.saveButton.click();
            System.out.println("Save button clicked.");
        }

        @Then("the success message should be displayed")
        public void theSuccessMessageShouldBeDisplayed() {
            Assert.assertTrue(profilePage.successMessage.isDisplayed(), "Success message not displayed!");
            System.out.println("Success message displayed: Profile successfully updated.");
        }
    }}


