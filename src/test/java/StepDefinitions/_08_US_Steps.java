package StepDefinitions;

import Pages._03_HamburgerMenu_Messaging;
import Pages._04_HamburgerMenu_Finance;
import Pages._08_AssignmentsFeature;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;

public class _08_US_Steps {

    _08_AssignmentsFeature hf =new _08_AssignmentsFeature();
    public class HamburgerMenuFinanceSteps {

        WebDriver driver;
        HamburgerMenuFinanceSteps hamburgerMenuPage;
        HamburgerMenuFinanceSteps financePage;

    @When("the student opens the Hamburger Menu")
    public void the_student_opens_the_hamburger_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("the student should be redirected to the Finance page")
    public void the_student_should_be_redirected_to_the_finance_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("the student has clicked on the {string} link in the Hamburger Menu")
    public void the_student_has_clicked_on_the_link_in_the_hamburger_menu(String string) {

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://example.com"); // Ana sayfanın URL'si
        System.out.println("Student is on the main page.");
        throw new PendingException();
    }
    @Then("the Finance page should be displayed")
    public void the_finance_page_should_be_displayed() {
        assertEquals("Finance", financePage.getPageTitle());
        System.out.println("Finance page is displayed successfully.");
        throw new PendingException();
    }
    @Then("the Finance page title should be {string}")
    public void the_finance_page_title_should_be(String string) {
        String actualTitle = financePage.getPageTitle();

        long expectedTitle = 0;
        assertEquals(expectedTitle, actualTitle);
        System.out.println("Finance page title is: " + actualTitle);
        throw new PendingException();
    }

        private String getPageTitle() {
        return getPageTitle();
        }
        }

    }
