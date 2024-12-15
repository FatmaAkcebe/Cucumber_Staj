package StepDefinitions;

import Pages._03_HamburgerMenu_Messaging;
import Pages._06_ProfileFeature;
import Pages._07_GradingFeature;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class _07_US_Steps {

    _03_HamburgerMenu_Messaging hm=new _03_HamburgerMenu_Messaging();

    @When("the student sees the Delete icon for a message and clicks on it")
    public void theStudentSeesTheDeleteIconForAMessageAndClicksOnIt() {
    }

    @When("the student sees the Restore icon for a message and clicks on it")
    public void theStudentSeesTheRestoreIconForAMessageAndClicksOnIt() {
    }

    public class MessagingSteps {

        WebDriver driver = GWD.getDriver();
        _07_GradingFeature messagingPage = new _07_GradingFeature();

        @When("the student navigates to the Trash link in the Messaging section")
        public void theStudentNavigatesToTheTrashLink() {
            messagingPage.trashLink.click();
            System.out.println("Navigated to the Trash link.");
        }

        @Then("the student should see the list of deleted messages")
        public void theStudentShouldSeeTheDeletedMessagesList() {
            Assert.assertTrue(messagingPage.deletedMessagesList.isDisplayed(), "Deleted messages list is not displayed.");
            System.out.println("Deleted messages list is displayed.");
        }

        @Then("the student should see the Delete icon for messages and click on it")
        public void theStudentSeesTheDeleteIconAndClicks() {
            Assert.assertTrue(messagingPage.deleteIcon.isDisplayed(), "Delete icon is not displayed.");
            messagingPage.deleteIcon.click();
            System.out.println("Delete icon clicked.");
        }

        @Then("the student should see the Restore icon for messages and click on it")
        public void theStudentSeesTheRestoreIconAndClicks() {
            Assert.assertTrue(messagingPage.restoreIcon.isDisplayed(), "Restore icon is not displayed.");
            messagingPage.restoreIcon.click();
            System.out.println("Restore icon clicked.");
        }

        @Then("a Success message should appear after restoring the message")
        public void successMessageAppearsAfterRestore() {
            Assert.assertTrue(messagingPage.successMessage.isDisplayed(), "Success message not displayed after restoring.");
            System.out.println("Success message displayed after restoring the message.");
        }

        @Then("a confirmation window should appear when the student clicks the Delete icon for permanent deletion")
        public void confirmationWindowAppearsForPermanentDeletion() {
            Assert.assertTrue(messagingPage.confirmationPopup.isDisplayed(), "Confirmation window is not displayed.");
            System.out.println("Confirmation window appeared for permanent deletion.");
        }

        @Then("a Success message should appear after confirming permanent deletion")
        public void successMessageAppearsAfterConfirmingDeletion() {
            Assert.assertTrue(messagingPage.successMessage.isDisplayed(), "Success message not displayed after permanent deletion.");
            System.out.println("Success message displayed after confirming permanent deletion.");
        }
    }
}
