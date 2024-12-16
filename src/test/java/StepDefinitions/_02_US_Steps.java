package StepDefinitions;

import Pages._01_LoginPage;
import Pages._02_HomePage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class _02_US_Steps {

    _02_HomePage hp = new _02_HomePage();


    @And("Click on the Element in Login Pages")
    public void clickOnTheElementInLoginPages(DataTable dtButtons) {

        List<String> buttons = dtButtons.asList();
        for (int i = 0; i < buttons.size(); i++) {
            hp.myClick(hp.getWebElement(buttons.get(i)));
        }
    }

    @Then("Techno Study Website Should be Displayed")
    public void technoStudyWebsiteShouldBeDisplayed() {

        GWD.getDriver().switchTo().window(GWD.getDriver().getWindowHandle());

        Set<String> idler = GWD.getDriver().getWindowHandles();
        Iterator gosterge = idler.iterator();
        String birinciPencereId = gosterge.next().toString();
        String ikinciPencereID = gosterge.next().toString();

        GWD.getDriver().switchTo().window(ikinciPencereID);
        System.out.println("GWD.getDriver().getTitle() = " + GWD.getDriver().getTitle());


        WebDriverWait bekle = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        bekle.until(ExpectedConditions.urlToBe("https://techno.study/"));

        Assert.assertEquals(GWD.getDriver().getCurrentUrl(),"https://techno.study/");
        String url = GWD.getDriver().getCurrentUrl();
        System.out.println("url " + url);


    }


}
