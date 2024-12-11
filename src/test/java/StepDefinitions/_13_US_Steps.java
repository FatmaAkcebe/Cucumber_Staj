package StepDefinitions;

import Pages._04_HamburgerMenu_Finance;
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

//    @When("the student click on the buttonn")
//    public void theStudentClickOnTheButtonn() {
//        Actions actions = new Actions(GWD.getDriver());
//        actions.sendKeys(Keys.PAGE_UP).perform(); // Sayfayı yukarı kaydır
//      JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
//        js.executeScript("window.scrollTo(0, 0)"); // Sayfanın en üstüne kaydır
//        MyFunc.Bekle(2);
//        af.myClick(af.AttandanceExcecuses);
//        MyFunc.Bekle(1);
//        af.myClick(af.AttandanceExcecuses);


//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(af.AttandanceExcecuses)); // Sayfa tam olarak yüklendiğinden emin olun

// Sayfanın en üstüne kaydırma
//        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
//        js.executeScript("window.scrollTo(0, 0)"); // Sayfanın en üstüne kaydır

//        MyFunc.Bekle(2); // Kaydırma sonrası biraz bekleme
//
//        js.executeScript("arguments[0].scrollIntoView(true);", af.AttandanceExcecuses); // Elementi görünür yap
//        af.myClick(af.AttandanceExcecuses); // Elementi tıkla

//        WebElement element = af.getWebElement("//*[text()=' ATTENDANCE EXCUSES ']");

// Elementin görünür olduğundan emin olun
//        if (element.isDisplayed()) {
//            af.myClick(element);
//        } else {
//            js.executeScript("arguments[0].scrollIntoView(true);", element); // Görünür yap
//            af.myClick(element);

//            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//*[text()=' ATTENDANCE EXCUSES ']")));
//            element.click();

    @When("the student click on the buttonn")
    public void theStudentClickOnTheButtonn() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

        // Sayfayı yukarı kaydırmak
        js.executeScript("window.scrollTo(0, 0)"); // Sayfanın en üstüne kaydır
        MyFunc.Bekle(2); // Kaydırma sonrası bekleme süresi

        // Öğeyi görünür hale getirme
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(af.AttandanceExcecuses));
        js.executeScript("arguments[0].scrollIntoView(true);", element); // Öğeyi görünür yap

        // Engelleyen öğe var mı kontrol et ve gizle
        WebElement blockingElement = GWD.getDriver().findElement(By.cssSelector("div[style*='position: sticky']"));
        js.executeScript("arguments[0].style.display='none';", blockingElement); // Engelleyici öğeyi gizle

        // Öğeyi tıklama
        wait.until(ExpectedConditions.elementToBeClickable(element)); // Öğenin tıklanabilir olmasını bekle
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(element).click().perform(); // Actions ile tıklama
    }

    @When("the student writes a message in the message field")
    public void theStudentWritesAMessageInTheMessageField() {
        af.mySendKeys(af.message,"I couldn't attend class because I was sick.");
    }

//    @When("the student click on the buttonn")
//    public void theStudentClickOnTheButtonn() {
//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
//        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
//
//        // Sayfayı yukarı kaydırmak
//        js.executeScript("window.scrollTo(0, 0)"); // Sayfanın en üstüne kaydır
//        MyFunc.Bekle(2); // Kaydırma sonrası bekleme süresi
//
//        // Öğeyi görünür hale getirme
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(af.AttandanceExcecuses));
//        js.executeScript("arguments[0].scrollIntoView(true);", element); // Öğeyi görünür yap
//
//        // Actions ile öğeye odaklanma ve tıklama
//        Actions actions = new Actions(GWD.getDriver());
//        actions.moveToElement(element).click().perform(); // Öğeye güvenli tıklama
//    }
}





