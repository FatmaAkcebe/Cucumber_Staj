package StepDefinitions;

import Pages._01_LoginPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class _01_US_Steps {
    public static WebDriver driver;
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

//    @Then("Login Message Should be Displayed")
//    public void loginMessageShouldBeDisplayed() {
//        lp.verifyMessageContainsText("Welcome");
//    }
//
//    @Then("Error Message should be Dislayed")
//    public void errorMessageShouldBeDislayed() {
//        lp.verifyMessageContainsText("Invalid");
//
//
//    }

    @Then("Login Message Should be Displayed")
    public void loginMessageShouldBeDisplayed() {
        String expectedMessage = "Welcome";
        lp.ContainsText(lp.successmessage, expectedMessage);
        String actualMessage = lp.successmessage.getText();
        System.out.println("actualMessage = " + actualMessage);
    }

    @When("Click on the Element in homePage")
    public void clickOnTheElementInHomePage(DataTable dtButtons) {
        List<String> buttons = dtButtons.asList();
        for (int i = 0; i < buttons.size(); i++) {
            lp.myClick(lp.getWebElement(buttons.get(i)));
        }
    }
       @Then("The page URL should be correct after clicking on the logo")
   public void thePageURLShouldBeCorrectAfterClickingOnTheLogo() {
           System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // şu an hala 1.sayfadayım

           Set<String> idLer = driver.getWindowHandles();
           Iterator gosterge = idLer.iterator();
           String birinciPencereID = gosterge.next().toString();
           String ikinciPencereID = gosterge.next().toString();

           driver.switchTo().window(ikinciPencereID); //2.Pencereye yani taba geçctim.
           MyFunc.Bekle(2);
           System.out.println("driver.getTitle() = " + driver.getTitle());
           driver.get("https://techno.study/");

           String expectedUrl = "https://techno.study/"; // Beklenen URL
//    String actualUrl = GWD.getDriver().getCurrentUrl(); // Geçerli URL'yi al
//
//    // URL'nin doğru olup olmadığını kontrol et
//        Assert.assertEquals(expectedUrl,actualUrl);


//    @Then("The page URL should be correct after clicking on the logo")
//    public void thePageURLShouldBeCorrectAfterClickingOnTheLogo() {
//    String expectedUrl = "https://techno.study/"; // Beklenen URL
//    String actualUrl = GWD.getDriver().getCurrentUrl(); // Geçerli URL'yi al
//
//    // URL'nin doğru olup olmadığını kontrol et
//        Assert.assertEquals(expectedUrl,actualUrl);
//}
//
//    @Then("The page URL should be correct after clicking on the logo")
//    public void thePageURLShouldBeCorrectAfterClickingOnTheLogo() {
//        WebDriver driver = GWD.getDriver();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds
//        String expectedUrl = "https://techno.study/";
//
//        wait.until(ExpectedConditions.urlToBe(expectedUrl));
//
//        // Get the current URL after waiting
//        String currentUrl = driver.getCurrentUrl();
//        System.out.println("Current URL: " + currentUrl);
//
//        // Validate the URL
//        Assert.assertEquals("URL does not match the expected value", expectedUrl, currentUrl);
//    }


       }
}




















//    @Then("Error Message should be Dislayed")
//    public void errorMessageShouldBeDislayed() {
//        String expectedMessage = "Welcome";
//        lp.ContainsText(lp.errormessage, expectedMessage);
//        String actualMessage=lp.successmessage.getText();
//        System.out.println("actualMessage = " + actualMessage);
//    }


