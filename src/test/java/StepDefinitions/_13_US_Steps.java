package StepDefinitions;

import Pages._05_AttendanceFeature;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

public class _13_US_Steps {

    _05_AttendanceFeature af=new _05_AttendanceFeature();

    @When("the student click on the button")
    public void theStudentClicksOnTheStudentFeesOption(DataTable dtButtons) {

        List<String> buttons = dtButtons.asList();
        for (int i = 0; i < buttons.size(); i++) {
            WebElement buttonElement = af.getWebElement(buttons.get(i));

            // İlk tıklama
            af.myClick(buttonElement);

            MyFunc.Bekle(1);

            // İkinci tıklama
            af.myClick(buttonElement);
        }
    }

    @When("the student click on the buttonn")
    public void theStudentClickOnTheButtonn() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();


        js.executeScript("window.scrollTo(0, 0)");
        MyFunc.Bekle(2);


        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(af.AttandanceExcecuses));
        js.executeScript("arguments[0].scrollIntoView(true);", element);


        WebElement blockingElement = GWD.getDriver().findElement(By.cssSelector("div[style*='position: sticky']"));
        js.executeScript("arguments[0].style.display='none';", blockingElement); // Engelleyici öğeyi gizle


        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(element).click().perform();
    }



    @When("the student click on the buttonnnn")
    public void theStudentClickOnTheButtonnnn() {
        MyFunc.Bekle(2);
        af.myClick(af.add);
    }

    @When("the student writes a message in the message field")
    public void theStudentWritesAMessageInTheMessageField() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(af.message));
        af.myClick(af.message);
        af.mySendKeys(af.message,"I couldn't attend class because I was sick.");

    }

}





